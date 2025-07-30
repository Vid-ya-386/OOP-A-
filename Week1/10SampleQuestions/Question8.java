package Questions;

import java.util.Scanner;

public class Question8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Addition: " + (v + y));
        System.out.println("Subtraction: " + (v - y));
        System.out.println("Mulitiplication: " + (v * y));
        System.out.println("Divison: " + (v / y));
        System.out.println("Modulus: " + (v % y));

        sc.close();
    }
}