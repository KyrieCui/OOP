import java.util.Scanner;
public class TestPalindrome {
	public static void main(String[] args) {
		String str1;
		System.out.print("Please enter a sentence: ");//hint for input
		Scanner input=new Scanner(System.in);//create a scanner
		str1=input.nextLine();//obtain the string
		str1=str1.toLowerCase();//Convert all to lowercase
		str1  = str1.replaceAll("[^a-z]", "");//remove the Punctuation, spaces, and capitalization
				for(int i=0;i<str1.length();i++) {
					
					if(str1.charAt(i)!=str1.charAt(str1.length()-i-1)) {
						System.out.println("It's not Palindrome");
						break;
					}
					else {
					System.out.println("It's palindrome");
					break;
					}
						}
				
					
				
}
	
				
		
}


