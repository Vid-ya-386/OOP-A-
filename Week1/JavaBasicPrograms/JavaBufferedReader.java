package mypackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class JavaBufferedReader {
public static void main(String[]args) throws IOException{
	InputStreamReader isr =  new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	System.out.println("Enter a character");
	char ch = (char) br.read();
	br.readLine();
	System.out.println("Enter a Name");
	String name = br.readLine();
	System.out.println(ch);
	System.out.println(name);
   }
}
