import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		String inStr;
		char ch1;
	System.out.print("Enter a string: ");
	Scanner input=new Scanner(System.in);
	inStr=input.next();
	System.out.print("The reverse of string "+"\""+inStr+"\""+" is ");
	for(int i=0;i<inStr.length();i++) {
		ch1=inStr.charAt(inStr.length()-i-1);
		System.out.print(ch1);
		}
	}
}
