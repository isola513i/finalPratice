package Pratice;

import java.util.Scanner;

public class ThrowDemo {
  static int balance = 5000;
  public static void main(String[] args) {
    try {
      Scanner kb = new Scanner(System.in);
      System.out.println("ป้อนจำนวนเงินที่ต้องการถอน = ");
      int money = kb.nextInt();
      withDraw(money);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  public static void withDraw(int amount) throws Exception {
//    จำนวนเงินที่ถอน
    if (amount <= 0) {
      throw new Exception("กรุณาป้อนจำนวเงินมากกว่า 0 ");
    }
    if (amount > balance) {
      throw new Exception("ยอดเงินคงเหลือไม่พอ");
    }
    balance -= amount;
    System.out.println("ถอนเงิน = " + amount);
    System.out.println("ยอดเงินคงเหลือ = " + balance);
  }

}
