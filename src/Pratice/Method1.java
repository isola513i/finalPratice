package Pratice;

public class Method1 {
  public static void main(String[] args) {
    display();
    calculate();
  }

  //  การสร้าง Method
  static void display() {
    System.out.println("Hello World");
  }

  static void calculate() {
    int a = 10;
    int b = 20;
    System.out.println("ผลบวก = " + (a + b));
  }
}
