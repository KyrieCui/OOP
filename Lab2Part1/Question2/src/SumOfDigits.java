import java.util.Scanner;
public class SumOfDigits {
	public static void main(String[] args) {
		int digit,result;
		System.out.print("Input an integer between 0 and 1000:");//hint for input
		Scanner input=new Scanner(System.in);//create a scanner
		digit=input.nextInt();//obtain the input value
		//result=digit/100+(digit-(digit/100)*100)/10+((digit-digit/100)-(digit-(digit/100)*100));
		result=digit/100+(digit-(digit/100)*100)/10+((digit-(digit/100)*100)-(digit-(digit/100)*100)/10*10);
		System.out.println("The sum of all digits in "+digit+" is "+result);
	}
}