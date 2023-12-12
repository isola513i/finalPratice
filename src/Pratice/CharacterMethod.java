package Pratice;

public class CharacterMethod {
  public static void main(String[] args) {
    Character alphabet = new Character('a');
    System.out.println(Character.isLetter(alphabet));
    System.out.println(Character.isDigit(alphabet));

    if (Character.isUpperCase(alphabet)){
      System.out.println("เป็นพิมพ์ใหญ่");
    }else {
      System.out.println("เป็นพิมพ์เล็ก");
    }


  }
}
