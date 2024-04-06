package assignment2;
import java.util.Scanner;
public class Question3 {
	static int factorial(int num)
	{
		if(num==1) {
			return 1;}
		else
		{
		return num*factorial(num-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the Number : " );
		num=sc.nextInt();
		System.out.println("Factorial of the number "+ num +" is : "+factorial(num));

	}

}
