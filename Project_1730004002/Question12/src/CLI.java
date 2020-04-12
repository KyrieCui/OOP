import java.util.Scanner;

public class CLI {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) throws UnknownConsumerException  {
		ElectricityCompany E=new ElectricityCompany("UIC Electric");	//create a ElectricityCompany method 
		while(true) {
			int i=readPosInt("Type an action (total:1 add:2 get:3 more:4 less:5 quit:6): ");	//enter the action
			switch(i) {
			case 1: 
				System.out.println("Total amount of power consumed: "+E.totalConsumption());
				break;	//output the total consumption
			case 2:
				int i2=readPosInt("Type the consumer type (power plant:1 house:2 solar house:3): ");	//enter the type of consumer
				switch(i2) {
				case 1:
					String name1=readLine("Enter the name of the consumer: ");	//enter the consumer's name
					int power1=readPosInt("Enter the initial amount of power: ");	//enter the amount of power
					E.addConsumer(new PowerPlant(name1, power1));	//add the PowerPlant consumer into the ArrayList
					System.out.println("Power plant "+"\""+name1+"\""+" generating "+power1+" watts of power added");
					break;	
				case 2:
					String name2=readLine("Enter the name of the consumer: ");	//enter the consumer's name
					int power2=readPosInt("Enter the initial amount of power: ");	//enter the amount of power
					try{
						E.addConsumer(new House(name2,power2));	
					}	//add the House consumer into the ArrayList
					catch(Exception e) {
						System.out.println("BUG! This must never happen!");
						System.exit(1);
					}
					System.out.println("House "+"\""+name2+"\""+" consuming "+power2+" watts of power added");
					break;
				case 3:
					String name3=readLine("Enter the name of the consumer: ");	//enter the consumer's name
					int power3=readPosInt("Enter the initial amount of power: ");	//enter the amount of power
					try{
						E.addConsumer(new SolarHouse(name3,power3));	//add the SolarHouse consumer into the ArrayList
					}
					catch(Exception e) {
						System.out.println("BUG! This must never happen!");
						System.exit(1);
					}
					System.out.println("Solar house "+"\""+name3+"\""+" consuming "+power3+" watts of power added");
					break;
				default:
						System.out.println("Unknown type of consumer!");
					break;
				}	//the case of "Type the consumer type"
				break;
			case 3:
				String name4=readLine("Enter the name of the consumer: ");	//enter the consumer's name
				try{
					System.out.println(name4+" uses "+E.getPower(name4)+" watts");	//print the power of the consumer used
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}	//if the name you type in the consumer ArrayList, get the power of the specific consumer
				break;
			case 4:
				String name5=readLine("Enter the name of the consumer: ");	//enter the consumer's name
				int power4=readPosInt("Enter the amount of power: ");	//enter the amount of power you want to add
				try {
					E.morePower(name5, power4);	//add power
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}	//if the name you type in the consumer ArrayList and the power you enter is positive, make more power of the consumers
				break;
			case 5:
				String name6=readLine("Enter the name of the consumer: ");	//enter the consumer's name
				int power5=readPosInt("Enter the amount of power: ");	//enter the amount of power you want to reduce
				try {
					E.morePower(name6, -power5);	//reduce the amount of power
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}	//case 5 is use to make the power less
				break;
			case 6:
				System.out.println("Goodbye!");
				System.exit(0);
				break;
			default:
				System.out.println("Unknown antion!");
				break;


			}
		}	//the case of the "Type an action"

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
				else if(i<0)
					System.out.println("Positive integers only!");
				else
					System.out.println("Unknown action!");
			}	//if the integer between 1 and 6 to select the action,performs the selected action,else print an error message 
			catch(Exception e) {
				System.out.println("You must type an integer!");


			}	//if the input is not integer, catch the exception, print "You must type an integer!" and enter again

			input.nextLine();
		}

	}

}




