package day1;

import java.math.BigInteger;
import java.util.Scanner;

public class Get_Input {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("What is Your Name");

		String Name = scanner.nextLine();
		System.out.println("Hi " + Name);

		System.out.println("What is Your Age");
		int Age = scanner.nextInt();
		System.out.println("Your Age is" + Age);
		
		System.out.println("What is Your CPA");
		float CPA = scanner.nextFloat();
		scanner.nextLine();
		System.out.println("Your CPA is " + CPA);
		
		System.out.println("What is Your Class Section");
		char Section = scanner.next().charAt(2);
		scanner.nextLine();
		System.out.println("Your are " + Section + " Section");
	
		System.out.println("What is Your Emp ID");
		BigInteger EmpID = scanner.nextBigInteger();
		scanner.nextLine();
		System.out.println("Your are EmpID is " + EmpID);
		
		scanner.close();
	}
}
