package Questions;
import java.util.Scanner;
public class Question9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a      = " + a + " (Binary: " + Integer.toBinaryString(a) + ")");
        System.out.println("b      = " + b + " (Binary: " + Integer.toBinaryString(b) + ")");
        
        System.out.println("a & b  = " + (a & b) + " (Binary: " + Integer.toBinaryString(a & b) + ")");
        System.out.println("a | b  = " + (a | b) + " (Binary: " + Integer.toBinaryString(a|b) + ")");
        System.out.println("a ^ b  = " + (a ^ b) + " (Binary: " + Integer.toBinaryString(a^b) + ")");
        System.out.println("a << 1 = " + (a << 1) + " (Binary: " + Integer.toBinaryString(a << 1) + ")");
        System.out.println("b >> 1 = " + (b >> 1) + " (Binary: " + Integer.toBinaryString(b >> 1) + ")");

        sc.close();
  }

}