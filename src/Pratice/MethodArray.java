package Pratice;

public class MethodArray {
  public static void main(String[] args) {
    int[] numberA = {10, 20, 30, 40, 50};
    displayArray(numberA);
    int [] numberB = {-10,-20,30,60,50};
    displayArray(numberB);

  }

  //  แสดงผลตัวเลขใน array ที่ส่งเข้ามาทำงานในเมธอด
  static void displayArray(int[] arr) {
    System.out.println("{");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
      if (i < arr.length - 1) {
        System.out.println(",");
      }
    }
    System.out.println("}");
  }

}
