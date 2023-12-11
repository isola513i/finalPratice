package Pratice;

public class ArrayBasic4 {
  //  ForEach
  public static void main(String[] args) {
    int[] number = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140};
    String[] fruits = {"Banana", "Coconut", "Apple", "Orange"};

    for (String data : fruits) {
      System.out.println(data);
    }
    int sum = 0;
    for (int item : number) {
      sum += item;
    }
    System.out.println("sum = " + sum);
  }
}
