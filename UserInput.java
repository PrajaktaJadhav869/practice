package Practice;

import java.util.Scanner;
//user input

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name:- ");
		String myname= input.nextLine();
		System.out.println("Welcome "+myname + " !!");
		System.out.print(myname+", Also tell me your age :- ");
		
		int age =input.nextInt();
		System.out.println("Your age is : "+ age);
		

	}

}
