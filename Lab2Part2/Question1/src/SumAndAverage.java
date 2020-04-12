
public class SumAndAverage {
	public static void main(String[] args) {
		int sum=0;//create a integer variable
		int i=1;
		int numberDivisibleBy7=0;//create a variable to calculate the number of the numbers from 1 to 100 that are divisible by 7
		double average=0;//create a double variable
		
		for(i=1;i<=100;i++) {
			if(i%2!=0)
			sum=sum+i;
	}//calculate the sum of the odd numbers from 1-100
		average=(double)sum/100;//calculate the average
		System.out.println("The sum is "+sum);
		System.out.println("The average is "+average);//output the answer
		
		sum=0;
		average=0;
		i=1;
		while(i<=100) {
			if(i%7==0) {
			sum=sum+i;
			numberDivisibleBy7=numberDivisibleBy7+1;
			}
			i++;
		}//calculate the sum of the numbers from 1 to 100 that are divisible by 7
		average=(double)sum/numberDivisibleBy7;//calculate the average
		System.out.println("The sum is "+sum);
		System.out.println("The average is "+average);//output the answer
		
		sum=0;
		average=0;
		i=1;
		do {
			sum=sum+i*i;
			i++;
		}while(i<=100);//calculate sum of the squares of all the numbers from 1 to 100
		System.out.println("The sum is "+sum);//output the answer
	
}

	
}
