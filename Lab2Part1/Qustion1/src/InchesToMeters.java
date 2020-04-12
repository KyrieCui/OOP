import java.util.Scanner;
public class InchesToMeters {
	public static void main(String[] args) {
		double inches,meters;//create double type variable
		System.out.print("Please input the number of inches:");
		Scanner input=new Scanner(System.in);
		inches=input.nextDouble();
		System.out.println(inches+" inches is "+0.0254*inches+"meters");
		
	}
}
