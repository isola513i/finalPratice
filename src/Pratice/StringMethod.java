package Pratice;

public class StringMethod {
  public static void main(String[] args) {
//    นิยาม String
    String name = "Nattapat";
    String name2 = "NattapaT";
    String city = new String("Krabi");

//    Concatenation = > ต่อ String
    System.out.println(name + " " + city);
    System.out.println(name.concat(city));
//    หาความยาว String
    System.out.println(name.length());
//    หาตำแหน่งตัวอักษร
    System.out.println(name.charAt(2));

//  เปรียบเทียบ .equals
    if (name.equals(name2)) {
      System.out.println("เหมือนกัน");
    } else {
      System.out.println("ไม่เหมือนกัน");
    }
// เปรียบเทียบไม่สนตัวพิมพ์เล็กพิมพ์ใหญ่
    if (name.equalsIgnoreCase(name2)) {
      System.out.println("เหมือนกัน");
    } else {
      System.out.println("ไม่เหมือนกัน");
    }
//    ขึ้นต้น
    String fullName = "Mr.Nattapat Lamnui";
    if (fullName.startsWith("Mr.")) {
      System.out.println("Men");
    } else {
      System.out.println("Women");
    }
//    ลงท้าย
    String code = "6010342TH";
    if (code.endsWith("TH")) {
      System.out.println("เป็นคนไทย");
    } else {
      System.out.println("ไม่ใช่คนไทย");
    }

    System.out.println(fullName.indexOf("Lamnui"));

  }

}
