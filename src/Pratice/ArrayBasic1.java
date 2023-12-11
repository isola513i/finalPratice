package Pratice;

public class ArrayBasic1 {
    public static void main(String[] args) {
//         การสร้าง ArrayBasic1

//        แบบกำหนดขนาดเอาไว้
        int[] number= new int[4];
//        กำหนดค่าลงไป
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        System.out.println(number[1]);

//        แบบกำหนดสมาชิก
        int []number2={10,20,30,40,50,60};
        System.out.println(number2[4]);
        number2[5] = 100; // เปลี่ยนค่าสมาชิกใน array ช่องที่ 5
        System.out.println(number2[5]);

    }
}
