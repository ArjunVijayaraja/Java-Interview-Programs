package practicePrograms;
import java.util.Scanner;

public class ArmstrongNumber {
	
	/// Armstrong Number - If the Sum of the cubes of the individuals digits of any number is equal
	///                   to the number itself it is said to be a Armstrong Number
	///					  Example : 407
	///					  (4^3)+(0^3)+(7^3) = 407 ---> it is an Armstrong number

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number to check Amstrong : ");
		int input = sc.nextInt();
		int og_num = input;
		double sum = 0;
		while(og_num>0)
		{
			sum = sum+(Math.pow(og_num%10, 3));
			og_num = og_num/10;
			
		}
		if(input == sum)
		{
			System.out.println("The sum of the cubes of the the individual digits : "+sum);
			System.out.println("It is a Amstrong NUmber");
		}
		else
		{
			System.out.println("The sum of the cubes of the the individual digits : "+sum);
			System.out.println("It is not a Amstrong NUmber");
			
		}

	}

}
