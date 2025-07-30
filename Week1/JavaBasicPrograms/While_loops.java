package mypackage;

public class While_loops {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 2) {
            System.out.println("While i = " + i);
            i++;
        }

        int j = 1;
        do {
            System.out.println("Do-While j = " + j);
            j++;
        } while (j <= 2);
    }
}
