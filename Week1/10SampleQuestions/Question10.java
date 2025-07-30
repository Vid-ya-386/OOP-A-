package Questions;

import java.util.Scanner;

public class Question10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " is divisible by both 3 and 5");
        } else if (num % 3 == 0) {
            System.out.println(num + " is divisible by 3");
        } else if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5");
        } else {
            System.out.println(num + " is not divisible by 3 or 5");
        }

        sc.close();
    }
}