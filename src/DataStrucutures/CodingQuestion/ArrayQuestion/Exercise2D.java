package DataStrucutures.CodingQuestion.ArrayQuestion;
/*
 Given 2D array calculate the sum of diagonal elements.

Example

myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
 
sumDiagonalElements(myArray2D) # 15
*/


public class Exercise2D {
  public static int sumDiagonalElements(int[][] array){
    int sum =0;
    int numRows = array.length;

    for(int i=0;i<numRows;i++){
      sum += array[i][i];
    }
    return sum;

  }
}
