package DataStrucutures.Arrays.TwoDiamentionalArray;
import java.util.Arrays;
public class Main {

  public static void main(String[] args) {
  //    int[][] int2DArray;

  // int2DArray = new int[2][2];

  // int2DArray[0][0] = 1;
  // int2DArray[0][1] = 2;
  // int2DArray[1][0] = 3;
  // int2DArray[1][1] = 4;

  // System.out.println(Arrays.deepToString(int2DArray));

  // String s2DArray[][] = {{"a","b"},{"c","d"}};
  // System.out.println(Arrays.deepToString(s2DArray));

  TwoDimensionalArray sda = new TwoDimensionalArray(4, 4);
  // sda.insertValueInTheArray(0, 1, 10);
  //  sda.insertValueInTheArray(0, 2, 20);
  //   sda.insertValueInTheArray(0, 3, 30);
  //    sda.insertValueInTheArray(0, 0, 40);

  // sda.accessCell(0, 3);
  sda.searchingValue(20);
  // System.out.println(Arrays.deepToString(sda.arr));
  }
 
}
