package questions;

import java.util.Scanner;

//-------------------------------------------------------
//Assignment 1
//Written by: Paolo Ciccarelli 40286203
//For COMP 248 Section P – Fall 2023
//--------------------------------------------------------

public class A2_Q2 {

	// Algorithm 2: Grade Calculator

	/*
	 * This program determines the corresponding lettered grade associated with a
	 * student's numerical score (out of 100). The instructor-provided lettered
	 * grading system functions as follows: "A" for scores 90-100, "B" for scores
	 * 80-89, "C" for scores 70-79, "D" for scores 60-69, and "F" for scores below
	 * 60.
	 * 
	 */

	public static void main(String[] args) {

		// The "score" variable stores the student's grade.
		// The "strike" variable tracks how many times users have entered invalid
		// inputs.
		double score, strike = 0;

		// This scanner will retrieve user inputs in the console.
		Scanner myKeyboard = new Scanner(System.in);

		// Displays the following text with the instructed format.
		System.out.println("-------****-------****-------****-------****-----****-----");
		System.out.println("Welcome to Grade Calculator");
		System.out.println("-------****-------****-------****-------****-----****-----");
		System.out.println("");

		// Prompts the user as instructed
		System.out.print("Enter the student's score (out of 100): ");
		score = myKeyboard.nextDouble();

		/*
		 * Once the input is received, it is validated with the criteria provided by the
		 * instructor.
		 * 
		 * Given that loops were banned for this assignment, it was necessary to
		 * implement the same validation algorithm multiple times for every conceivable
		 * outcome.
		 *
		 * Note that the "strike" condition is implemented only after the first
		 * iteration of the validation algorithm, since there existed no possible
		 * outcome in which the "strike" condition would be true during the first
		 * iteration.
		 */

		// First Iteration
		if (score < 0) {
			System.out.println("The score has to be zero or above. Please try again.");
			++strike;
			score = myKeyboard.nextDouble();

			// Second Iteration
			if (score < 0) {
				++strike;

				if (strike >= 2) {
					System.out.println("It is still an invalid input. Bye!");
					System.exit(1);
				}

				System.out.println("The score has to be zero or above. Please try again.");
				score = myKeyboard.nextDouble();
			} else if (score > 100) {
				++strike;

				if (strike >= 2) {
					System.out.println("It is still an invalid input. Bye!");
					System.exit(1);
				}

				System.out.println("The score has to be below 100. Please try again.");
				score = myKeyboard.nextDouble();
			} else {

				/*
				 * Knowing that the lettered grading system is concerned only with the range of
				 * "tens" the score belonged to rather than the individual score itself, each
				 * case was defined by the digit in the "tens" position.
				 *
				 * The inputed score would therefore be divided by 10, then subsequently cycled
				 * through the switch statement. Finally, the final lettered grade, dependent on
				 * the case chosen, would be printed.
				 */

				score = score / 10;
				switch ((int) score) {
				case 10:
					System.out.println("The student's grade is: A");
					break;
				case 9:
					System.out.println("The student's grade is: A");
					break;
				case 8:
					System.out.println("The student's grade is: B");
					break;
				case 7:
					System.out.println("The student's grade is: C");
					break;
				case 6:
					System.out.println("The student's grade is: D");
					break;
				default:
					System.out.println("The student's grade is: F");
					myKeyboard.close();
				}
			}

			// First Iteration
		} else if (score > 100) {
			System.out.println("The score has to be below 100. Please try again.");
			strike++;
			score = myKeyboard.nextDouble();

			// Second Iteration
			if (score < 0) {
				++strike;

				if (strike >= 2) {
					System.out.println("It is still an invalid input. Bye!");
					System.exit(1);
				}

				System.out.println("The score has to be zero or above. Please try again.");
				score = myKeyboard.nextDouble();
			} else if (score > 100) {
				++strike;

				if (strike >= 2) {
					System.out.println("It is still an invalid input. Bye!");
					System.exit(1);
				}

				System.out.println("The score has to be below 100. Please try again.");
				score = myKeyboard.nextDouble();
			} else {

				/*
				 * Knowing that the lettered grading system is concerned only with the range of
				 * "tens" the score belonged to rather than the individual score itself, each
				 * case was defined by the digit in the "tens" position.
				 *
				 * The inputed score would therefore be divided by 10, then subsequently cycled
				 * through the switch statement. Finally, the final lettered grade, dependent on
				 * the case chosen, would be printed.
				 */

				score = score / 10;
				switch ((int) score) {
				case 10:
					System.out.println("The student's grade is: A");
					break;
				case 9:
					System.out.println("The student's grade is: A");
					break;
				case 8:
					System.out.println("The student's grade is: B");
					break;
				case 7:
					System.out.println("The student's grade is: C");
					break;
				case 6:
					System.out.println("The student's grade is: D");
					break;
				default:
					System.out.println("The student's grade is: F");
					myKeyboard.close();
				}
			}

			// First Iteration
		} else {

			/*
			 * Knowing that the lettered grading system is concerned only with the range of
			 * "tens" the score belonged to rather than the individual score itself, each
			 * case was defined by the digit in the "tens" position.
			 *
			 * The inputed score would therefore be divided by 10, then subsequently cycled
			 * through the switch statement. Finally, the final lettered grade, dependent on
			 * the case chosen, would be printed.
			 */

			score = score / 10;
			switch ((int) score) {
			case 10:
				System.out.println("The student's grade is: A");
				break;
			case 9:
				System.out.println("The student's grade is: A");
				break;
			case 8:
				System.out.println("The student's grade is: B");
				break;
			case 7:
				System.out.println("The student's grade is: C");
				break;
			case 6:
				System.out.println("The student's grade is: D");
				break;
			default:
				System.out.println("The student's grade is: F");
				myKeyboard.close();
			}
		}
	}

}
