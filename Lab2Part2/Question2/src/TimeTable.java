
public class TimeTable {

	public static void main(String[] args) {
		System.out.println("* |  1   2   3   4   5   6   7   8   9");
		System.out.println("---------------------------------------");//output the first and second line
		for(int i=1;i<10;i++) {
			for(int x=1;x<10;x++) {
				System.out.print(i+" | ");
				break;
				}
			for(int x=1;x<10;x++) {
				System.out.print(" "+x*i);
				if(i*x<10)
					System.out.print("  ");
				else
					System.out.print(" ");
		
			}
			System.out.println();
			
		}//output the column
	}
}
