import java.util.*;
public class ProblemOne{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner object
		System.out.println("Enter an integer:");
		int inp = sc.nextInt();
		Integer integer = inp;
		System.out.println("The binary equivalent of "
				+ "a given number:" + Integer.toBinaryString(inp));
		System.out.println("The Hexadecimal equivalent of "
				+ "a given number:" + Integer.toHexString(inp));
		System.out.println("The Octal equivalent of "
				+ "a given number:" + Integer.toOctalString(inp));
		sc.close();
		
		
		
		
		
		

	}

}
