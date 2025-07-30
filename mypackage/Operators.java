package mypackage;

public class Operators {
    public static void main(String[] args) {
        int a = 13, b = 24;
        System.out.println("Add: " + (a + b));
        System.out.println("Subtract: " + (a - b));
        System.out.println("Multiply: " + (a * b));
        System.out.println("Divide: " + (a / b));
        a++;
        b--;
        System.out.println("After a++: " + a);
        System.out.println("After b--: " + b);
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));
        int max = (a > b) ? a : b;
        System.out.println("Greater number: " + max);
    }
}
