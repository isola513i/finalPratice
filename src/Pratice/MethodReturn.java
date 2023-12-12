package Pratice;

public class MethodReturn {
  public static void main(String[] args) {
    connectServer(150);
  }
  public static void connectServer(int ping){
    System.out.println("แสดงค่า ping = " + ping);
    if (ping>100){
      return;
    }
    System.out.println("เชื่อมต่อกับ Server");
  }
}
