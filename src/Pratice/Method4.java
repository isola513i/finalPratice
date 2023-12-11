package Pratice;

public class Method4 {
  public static void main(String[] args) {
    int result = maxNumber(100, 20);
    int result2 = minNumber(20,50);
    System.out.println("ค่าที่มากที่สุด = " + result);
    System.out.println("ค่าที่น้อยที่สุด = " + result2);
  }
/*
 ชนิดข้อมูลที่จะส่งออกไป ชื่อเมธอด (ค่าที่่ส่งเข้ามา){
   //การประมวลผล
   return ชนิดข้อมูล
 }
  */

  // เปรียบเทียบตัวเลข 2 ตัว
  static int maxNumber(int a, int b) {
//    การประมวลผล
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }
  static int minNumber(int a, int b) {
//    การประมวลผล
    if (a < b) {
      return a;
    } else {
      return b;
    }
  }
}
