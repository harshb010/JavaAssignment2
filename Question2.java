/*Program to check Harshad number or not using Java
Hint: - Harshad number is a number or an integer in base 10 which is
completely divisible by sum of its digits.
Example :
Suppose a number 24 . Calculate the sum of digits of the number (2 +
4) = 6 .
Check whether the number entered by user is completely divisible by
sum of its digits or not.*/

package assignment2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, r, b, sum = 0, temp;

		a = sc.nextInt();
		temp = a;
		while (a > 0) {
			r = a % 10;
			sum += r;
			a = a / 10;
		}
		if (temp % sum == 0) {
			System.out.println("Harshad NUM");
		} else
			System.out.println("No");

	}

}
