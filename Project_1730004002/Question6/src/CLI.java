import java.util.Scanner;

public class CLI {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		String str1 = readLine("Type some text: ");
		System.out.println("Text read is: " + str1);
		int i = readPosInt("Type an integer: ");
		System.out.println("Integer read is: " + i);
		String str2 = readLine("Type some text again: ");
		System.out.println("Text read is: " + str2);
	}
	private static String readLine(String str) {
		System.out.print(str);	//print its string argument on the screen
		String str1=input.nextLine();
		return str1;
	}
	private static int readPosInt(String str) {
		while(true) {
			System.out.print(str);
			try {
				int i=input.nextInt();
				if(i>=0) {
					input.nextLine();
					return i;
				}
				else
					System.out.println("Positive integers only!");
			}	//if the integer greater than 0 output the integer,if smaller than 0 print the "You must type an integer!"
			catch(Exception e) {
				System.out.println("You must type an integer!");
			

			}	//if the input is not integer, catch the exception, print "You must type an integer!" and enter again
			
			input.nextLine();
		}

	}

}



