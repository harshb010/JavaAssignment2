package assignment2;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter the Size of Array : ");
		a=sc.nextInt();
		int arr[]=new int[a];
		int count=0;
		int cnt=0;
		for(int i=0;i<a;i++)
		{
			System.out.println("Enter the "+ (i+1) +" Element :");
			arr[i]=sc.nextInt();
			if(arr[i]%2==0)
			{
				count++;
			}else {
				cnt++;
			}
		}
		System.out.println("Even Count : "+count);
		System.out.println("Odd Count : "+cnt);

	}

}
