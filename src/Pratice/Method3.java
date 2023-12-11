package Pratice;

import java.util.Scanner;
public class Method3 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.println("ป้อนเงินเดือนของคุณ = ");
    double salary = kb.nextDouble();
    System.out.println("เงินเดือน = " + salary);
    double bonus = getBonus();
    salary += bonus;
    System.out.println("เงินเดือน + โบนัส = " + salary);
  }

  //  modifier ชนิดข้อมูลที่จะส่งออกมาทำงานในโปรแกรมหลัก ชื่อเมธอด(){}
  static String getIP() {
    return "127.0.0.1";
  }

  static double getBonus() {
    return 1000.0;
  }

//  void จะไม่มี Return

}
