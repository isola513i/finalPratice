package Pratice;

public class Method2 {
  public static void main(String[] args) {
    display("Hello My name is Ice");
    fullName("Nattapat", "Lamnui");
    plus(10, 20);
    plus(500,200);
    substract(50,10);
  }

  static void display(String message) { // message is parameter
    System.out.println(message);
  }

  static void fullName(String firstname, String lastname) {
    System.out.println("ชื่อ = " + firstname + " นามสกุล = " + lastname);
  }

  static void plus(int a, int b) {
    int c = a + b;
    System.out.println("ผลบวกตัวเลข = " + c);

  }

  static void  substract(int x,int y){
    int c = x-y;
    System.out.println("ผลลบตัวเลข = " + c);
  }

}
