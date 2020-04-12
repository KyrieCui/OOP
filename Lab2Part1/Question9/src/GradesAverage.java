import java.util.Scanner;
public class GradesAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int numStudents,grade,sum=0;
			System.out.print("Please enter the number of the students: ");
			Scanner input=new Scanner(System.in);
			numStudents=input.nextInt();
			int[] grades=new int[numStudents];
			for(int i=0;i<numStudents;i++) {
				System.out.print("Please enter the grade for student: ");
				grade=input.nextInt();
				if(grade>=0&&grade<=100) {
				grades[i]=grade;
				}
				else {
					System.out.println("Invalid grade, try again..." );
				i=0;
				continue;
			}
			}
			for(int x=0;x<numStudents;x++) {
				sum=sum+grades[x];
			}
			System.out.print("The average is "+sum/numStudents);
	}

}
