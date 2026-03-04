/*
  File: Converting Data Types
  Author: Angie
  Date Created: Mar 4, 2026
  Date Last Modified: Mar 4, 2026
 */

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
	}

	public static void q1() {
		//Write question 1 code here
		/* Ask the user to "Input an integer: ". 
		Store it in a variable, then convert to an integer. 
		Add 3 to variable. Output the variable. */

	Scanner input = new Scanner(System.in);

	System.out.print("Input an integer: ");
	int integer = input.nextInt();

	integer = integer + 3;
	System.out.println(integer);


	}

	public static void q2() {
		//Write question 2 code here
		/* Ask the user to "Input a number: ". Store it in a variable. 
		Concatenate the number 4 to the end. 
		Convert it to a double. Add 2 to it. Output the variable. */

		Scanner input = new Scanner(System.in);

		System.out.print("Input a number: ");
		int num = input.nextInt();

		String four = num + "4";
		
		double d = Double.parseDouble(four);
		d = d + 2;

		System.out.println(d);

	}

	public static void q3() {
		//Write question 3 code here
		/* Ask the user to "Input a radius: ". Store it as a variable. 
		Convert it to a double. 
		Use the number as the radius to calculate the area of a circle and output it. 
		Use 3.14 as the value for pi.*/

		Scanner input = new Scanner(System.in);

		System.out.print("Input a radius: ");
		int radius = input.nextInt();

		double rad = radius;
		rad = 3.14 * (Math.pow(rad, 2)); //radius^2

		System.out.println(rad);

		//come back


	}

	public static void q4() {
		//Write question 4 code here
		/* Ask the user to "Input a number: ". Store it in a variable. 
		Convert it to a double. Multiply its value by 12 then round the number down to the nearest whole number. 
		Output the final value of the variable. */

		Scanner input = new Scanner(System.in);

		System.out.print("Input a number: ");
		int num = input.nextInt();

		double num1 = num;
		num1 = num1 * 12;
		num1 = Math.floor(num1);

		System.out.println(num1);

	}

}
