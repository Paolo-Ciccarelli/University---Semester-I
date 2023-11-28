package questions;

import java.util.Scanner;

//-------------------------------------------------------
//Assignment 2
//Written by: Paolo Ciccarelli 40286203
//For COMP 248 Section P – Fall 2023
//--------------------------------------------------------

public class A2_1Q {

	// Algorithm 1: BMI (Body Mass Index) Calculator

	/*
	 * This program calculates an individual's BMI according to their weight (in
	 * kilograms) and height (in meters). The instructor-provided formula used for
	 * BMI computations is: weight / (height * height). The BMI value computed will
	 * subsequently be categorized among four different categories: "underweight"
	 * for BMI less than 18.5, "normal weight" for BMI between 18.5 and 24.9,
	 * "overweight" for BMI between 25 and 29.9, and "obesity" for BMI 30 or
	 * greater. Finally, users may query the program for advice should they choose
	 * so.
	 */

	public static void main(String[] args) {

		// The "weight" variable is self-explanatory enough, unit is kilograms.
		// The "height" variable is self-explanatory enough, unit is meters.
		// The "BMI" variable stores the value returned by the BMI formula.

		// The "advice" variable stores the String message which differs depending on
		// the assigned weight category.

		// The "userInput" variable stores the String inputed by the user,
		// regarding whether they wish to receive health advice or not.
		double weight, height, BMI;
		String advice = null, userInput;

		// This scanner will retrieve user inputs in the console.
		Scanner myKeyboard = new Scanner(System.in);

		// Displays the following text with the instructed format.
		System.out.println("-------****-------****-------****-------****-----****-----");
		System.out.println("Welcome to BMI Calculator");
		System.out.println("-------****-------****-------****-------****-----****-----");
		System.out.println("");

		// Queries the user for the weight and height values as instructed.
		System.out.print("Enter weight (in kilograms): ");
		weight = myKeyboard.nextDouble();
		System.out.print("Enter height (in meters): ");
		height = myKeyboard.nextDouble();

		/*
		 * Computes the BMI using the instructed-provided formula below, which employs
		 * the previously retrieved weight and height values. Afterwards, the double
		 * value returned formatted in accordance with instructions provided.
		 */
		BMI = weight / (height * height);
		System.out.print("BMI: ");
		System.out.format("%.2f", BMI);
		System.out.println();

		/*
		 * Depending on the double value returned by the BMI formula, the program will
		 * assign the appropriate weight category, which is subsequently printed to the
		 * console. The previously declared "advice" variable is also assigned a message
		 * unique to the specific category for later uses.
		 */
		if (BMI < 18.5) {
			System.out.println("Category: Underweight");
			advice = "Please eat well and do more exercises.";
		} else if (BMI > 18.5 && BMI < 24.9) {
			System.out.println("Category: Normal weight");
			advice = "Congratulations, you are doing fairly well. Keep on going.";
		} else if (BMI > 25 && BMI < 29.9) {
			System.out.println("Category: Overweight");
			advice = "Please watch out what you eat and do more exercises!";
		} else if (BMI > 30) {
			System.out.println("Category: Obesity");
			advice = "Please contact our experts for professional help.";
		}

		/*
		 * The program queries the user whether they would wish to receive health advice
		 * regarding their weight category. If the user responds with anything but "Y",
		 * "y", or "yes", the program will output a goodbye message and terminate.
		 */
		System.out.println("do you some tips according to your BMI?");
		userInput = myKeyboard.next();

		if (userInput.equalsIgnoreCase("Y") || userInput.equals("yes")) {
			System.out.println(advice);
		} else {
			System.out.println("Nice to meet you too. Bye!");
		}

		myKeyboard.close();

	}

}