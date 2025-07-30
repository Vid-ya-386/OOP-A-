package Questions;
import java.util.Scanner;

public class Question2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Roll No: ");
        int roll = sc.nextInt();

        System.out.print("Age: ");
        int age = sc.nextInt();

        System.out.print("Gender (M/F): ");
        char gender = sc.next().charAt(0);

        System.out.print("Percentage: ");
        float percent = sc.nextFloat();
        System.out.println("\n~~~ Student Details ~~~");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Percentage: " + percent + "%");

        sc.close();
  }
}
