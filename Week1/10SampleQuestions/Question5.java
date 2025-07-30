package Questions;
import java.util.Scanner;
public class Question5 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        char ch = sc.next().charAt(0);
	        int ascii = (int) ch;

	        System.out.println("Character: " + ch);
	        System.out.println("ASCII value: " + ascii);
	        
	        sc.close();
	    }
	}
