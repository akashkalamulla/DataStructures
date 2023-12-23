package DataStrucutures;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Main{

  public static void f2(){
    String[] fruits = {"orange","grape","apple","lemon","banana"};
    Arrays.sort(fruits);
    System.out.println("After Sorting: "+Arrays.toString(fruits));
  }

  public static void f1(){
    int[] numbers={4,9,1,3,2,8,7,0,6,5};
    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));
  }

  public static void main(String[] args){
    f2();

    //Compariosns
    String s1="abc";
    String s2 = "abe";
    System.out.println(s1.compareTo(s2));
  }
}