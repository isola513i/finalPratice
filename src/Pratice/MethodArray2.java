package Pratice;

public class MethodArray2 {
  public static void main(String[] args) {
    int[] numberA = {10, 100, 30, 40, 50};
    System.out.println("ค่าที่มากที่สุด คือ " + findMaxInArray(numberA));
    System.out.println("ค่าที่น้อยที่สุด คือ " + findMinInArray(numberA));
    System.out.println("ตำแหน่งมาก = " + findMaxIndex(numberA));
    System.out.println("ตำแหน่งน้อย = " + findMinIndex(numberA));
    int[] numberB = {-10, -20, 30, 60, 50};
    System.out.println("ค่าที่มากที่สุด คือ " + findMaxInArray(numberB));
    System.out.println("ค่าที่น้อยที่สุด คือ " + findMinInArray(numberB));
    int[] numberC = {100, 200};
    System.out.println("ค่าที่มากที่สุด คือ " + findMaxInArray(numberC));
    System.out.println("ค่าที่น้อยที่สุด คือ " + findMinInArray(numberC));
  }

  static int findMaxInArray(int[] arr) {
//    ค้นหาค่าที่มากที่สุดใน Array
//    ได้ค่ามากที่สุด
    int maxValue = arr[0]; // เก็บค่าสูงสุดไว้เป็นค่าเริ่มต้น
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > maxValue) {
        maxValue = arr[i];
      }
    }
    return maxValue;
  }

  static int findMinInArray(int[] arr) {
//    ค้นหาค่าที่น้อยที่สุดใน Array
//    ได้ค่าน้อยที่สุด
    int minValue = arr[0]; // เก็บค่าต่ำสุดไว้เป็นค่าเริ่มต้น
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < minValue) {
        minValue = arr[i];
      }
    }
    return minValue;
  }

  static int findMaxIndex(int[] arr) {
    int maxIndex = 0; //เก็บตำแหน่งสมาชิกที่มีค่ามากที่สุดใน arr
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > arr[maxIndex]) {
        maxIndex = i;
      }
    }
    return maxIndex;
  }

  static int findMinIndex(int[] arr) {
    int minIndex = 0; //เก็บตำแหน่งสมาชิกที่มีค่ามน้อยที่สุดใน arr
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < arr[minIndex]) {
        minIndex = i;
      }
    }
    return minIndex;
  }

}
