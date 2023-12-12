package Pratice;

public class ExceptionDemo1 {
  public static void main(String[] args) {
    try {
//      int a = 10;
//      int b = 2;
//      int c = a / b;
//      System.out.println(c);

      int [] item ={10,20,30};
      System.out.println(item[20]);

    } catch (ArithmeticException e) {
      System.out.println("ห้ามหารด้วย 0 ");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Index ไม่ถูกต้อง");
    }finally {
//      คำสั่งอื่นๆ
      System.out.println("Hello World");
    }


  }
}
