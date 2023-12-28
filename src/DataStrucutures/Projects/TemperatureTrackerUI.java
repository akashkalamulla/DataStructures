package DataStrucutures.Projects;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureTrackerUI {
  private JTextField numDaysField;
  private JTextArea resultArea;

  public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> {
          new TemperatureTrackerUI().createAndShowGUI();
      });
  }

  private void createAndShowGUI() {
      JFrame frame = new JFrame("Temperature Tracker");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JPanel panel = new JPanel();
      addComponents(panel);

      frame.getContentPane().add(panel);
      frame.setSize(300, 200);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
  }

  private void addComponents(JPanel panel) {
      panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

      JLabel numDaysLabel = new JLabel("Enter the number of days:");
      panel.add(numDaysLabel);

      numDaysField = new JTextField();
      panel.add(numDaysField);

      JButton submitButton = new JButton("Submit");
      panel.add(submitButton);

      resultArea = new JTextArea();
      resultArea.setEditable(false);
      panel.add(resultArea);

      submitButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              handleSubmission();
          }
      });
  }

  private void handleSubmission() {
      int numDays = Integer.parseInt(numDaysField.getText());
      int[] temps = new int[numDays];

      int sum = 0;
      for (int i = 0; i < numDays; i++) {
          String input = JOptionPane.showInputDialog("Enter temperature for day " + (i + 1) + ":");
          temps[i] = Integer.parseInt(input);
          sum += temps[i];
      }

      double average = sum / numDays;

      int above = 0;
      for (int i = 0; i < temps.length; i++) {
          if (temps[i] > average) {
              above++;
          }
      }

      String result = "Average Temp = " + average + "\n" + above + " days above average";
      resultArea.setText(result);
  }
}
