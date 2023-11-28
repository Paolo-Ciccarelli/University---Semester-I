import java.util.Scanner;

// -------------------------------------------------------
// Assignment 3
// Written by: Paolo Ciccarelli 40286203
// For COMP 248 Section P – Fall 2023
// --------------------------------------------------------

public class A3_Q1 {

	// Algorithm 1: Basic Calculator: Addition and Subtraction

	/*
	 * Prints the computational result from either the addition (1) or the
	 * subtraction (2) calculator operations. The calculator operation performed
	 * depends on the user, whom input operands according to the following format:
	 * count num1 num2 ... numn where n is value stored by the count variable.
	 * 
	 * If the addition calculator operation is chosen, the program will compute as
	 * follows: num1 + num2 + ... + numn. If the subtraction calculator operator is
	 * chosen, the program will compute as follows: num1 - num2 - ... - numn.
	 */

	public static void main(String[] args) {

		String userInput;
		int calculationOption;

		// Displays the following text as instructed.
		System.out.println("Welcome to this calculator, offering Addition and Subtraction.");

		// The conditional statement ensures that the program loops indefinitely until
		// the termination condition is true (ie: the user no longer wishes to perform
		// computations).
		while (1 < 100) {

			Scanner myKeyboard = new Scanner(System.in);

			// Displays the text as instructed.
			System.out.print("Please select 1 for Addition or 2 for Subtraction: ");

			userInput = myKeyboard.next(); // retrieves the user input response to the previous question.

			/*
			 * The program verifies the validity of the userInput value retrieved. If the
			 * value retrieved isn't an integer, the program prints an error message
			 * requesting that the user inputs an accepted value, then subsequently restarts
			 * the loop anew.
			 */
			try {
				calculationOption = Integer.valueOf(userInput.trim());
			} catch (NumberFormatException e) {
				System.out.println("Unfortunately your input isn't an integer. Please try again.");
				continue;
			}

			/*
			 * The conditional statement ensures that the user has inputed either acceptable
			 * answer, being "1" for addition or "2" for subtraction.
			 */
			if (calculationOption == 1 || calculationOption == 2) {

				// Addition Option
				if (calculationOption == 1) {
					System.out.print("Please input your numbers: ");

					// The program retrieves the value of the count variable,
					// responsible for storing the number of operands the computation considers.
					int count = myKeyboard.nextInt();

					double sum = 0; // the final computational result the program will print.
					double input; // responsible for retrieving the value of the operand(s).

					/*
					 * Depending on the value stored in the count variable, the program will
					 * retrieve the same number of double values. Each double value is subsequently
					 * added with the input variable.
					 */
					for (int i = 0; i < count; i++) {
						input = myKeyboard.nextDouble();
						sum = sum + input;
					}

					// Displays the following text as instructed.
					System.out.print("The result of your addition is: ");

					// Ensures that the final computational result is rounded to two
					// decimal digits, as instructed.
					System.out.format("%.2f", sum);
					System.out.println("");

					// Displays the following text as instructed.
					System.out.print("Do you want to perform another operation? y/yes ");

					String answer = myKeyboard.next(); // retrieves the user input response to the previous question.

					/*
					 * The program queries the user whether they would wish to perform additional
					 * computations. If the user responds with anything but "Y", "y", or "Yes", the
					 * program will output a goodbye message and terminate.
					 */
					if (answer.equalsIgnoreCase("y") || answer.equals("Yes")) {
						continue;
					} else {
						System.out.println("Goodbye!");
						break;
					}

					// Subtraction Option
				} else if (calculationOption == 2) {
					System.out.print("Please input your numbers: ");

					// The program retrieves the value of the count variable,
					// responsible for storing the number of operands the computation considers.
					int count = myKeyboard.nextInt();

					double sum = 0; // the final computational result the program will print.
					double input; // responsible for retrieving the value of the operand(s).

					/*
					 * Depending on the value stored in the count variable, the program will
					 * retrieve the same number of double values. Initially, the value of the first
					 * double value will simply be assigned to the input variable. Each subsequent
					 * double value is then subtracted from this modified input variable.
					 */
					for (int i = 0; i < count; i++) {
						if (i == 0) {
							input = myKeyboard.nextDouble();
							sum = input;
							continue;
						}
						input = myKeyboard.nextDouble();
						sum = sum - input;
					}

					// Displays the following text as instructed.
					System.out.print("The result of your subtraction is: ");

					// Ensures that the final computational result is rounded to two
					// decimal digits, as instructed.
					System.out.format("%.2f", sum);
					System.out.println("");

					// Displays the following text as instructed.
					System.out.print("Do you want to perform another operation? y/yes ");

					String answer = myKeyboard.next(); // retrieves the user input response to the previous question.

					/*
					 * The program queries the user whether they would wish to perform additional
					 * computations. If the user responds with anything but "Y", "y", or "Yes", the
					 * program will output a goodbye message and terminate.
					 */
					if (answer.equalsIgnoreCase("y") || answer.equals("Yes")) {
						continue;
					} else {
						System.out.println("Goodbye!");
						break;
					}
				}

				/*
				 * If the user has not inputed either acceptable answer, being "1" for addition
				 * or "2" for subtraction, the program will print the following error message.
				 * The program will subsequently restart the loop anew.
				 */
			} else
				System.out.println("Operation not supported. Please try again.");
			continue;
		}
	}
}
