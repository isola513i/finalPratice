package Pratice;

public class ArrayBasic5 {
  public static void main(String[] args) {
//    Array 2 มิติ
    String [][] products = {
            {"เก้าอี้","โต๊ะ","โคมไฟ"},
            {"คีย์บอร์ด","เม้าส์","แป้นพิมพ์"},
            {"ลิปติก","โรลออน","ครีม"},
    };
//    products[เลขแถว][เลขคอลัมน์]
    System.out.println("Before = " + products[0][2]);
//    เปลี่ยนสมาชิก
    products[0][2] = "ต้นไม้";
    System.out.println("After = " + products[0][2]) ;
  }
}
