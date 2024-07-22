package Practice;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to our Calculator");
		System.out.print("Enter the first number :- ");
		int firstnumber = input.nextInt();
		System.out.print("Now, Enter the second number :- ");
		int secondnumber= input.nextInt();
		int sum=firstnumber+secondnumber;
		System.out.println("Sum of two number = "+ sum);
		
		
	}
}
