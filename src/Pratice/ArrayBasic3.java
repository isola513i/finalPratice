package Pratice;

public class ArrayBasic3 {
  //  ForLoop
  public static void main(String[] args) {
    int[] number = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140};
    int count = number.length;
    for (int i = 0; i < count; i++) {
//    เริ่มต้นที่ index 0
      System.out.println("ตำแหน่งที่ " + i + " = " + number[i]);
    }
  }
}
