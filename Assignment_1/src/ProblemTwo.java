import java.util.*;
public class ProblemTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two double-type numbers:");
		double d1, d2, avg;
		if(sc.hasNextDouble() && !sc.hasNextInt())
		{
			d1 = sc.nextDouble();
			d2 = sc.nextDouble();
			avg = (d1 + d2) / 2;
			System.out.println("Average = " + avg);
		}
		else
		{
			System.out.println("Error: input has no double type.");
			System.exit(0);
		}
	}

}
