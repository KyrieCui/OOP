import java.util.Scanner;
public class CheckOddEven {
	public static void main(String[] args) {
		int number;
		System.out.print("Please enter a integer number:");//hint for input
		Scanner input=new Scanner(System.in);//create a scanner
		number=input.nextInt();//obtain the input value
		if(number%2==0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
		System.out.println("BYE");
	}
}
