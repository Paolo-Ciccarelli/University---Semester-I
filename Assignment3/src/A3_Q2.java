import java.util.Scanner;

// -------------------------------------------------------
// Assignment 3
// Written by: Paolo Ciccarelli 40286203
// For COMP 248 Section P – Fall 2023
// --------------------------------------------------------

public class A3_Q2 {

	// Algorithm 2: Skiing Ranker

	/*
	 * Prints the name and completion time of the skiers ranked first, second, and
	 * third respectively in the skiing competition. The ranking of the skier is
	 * determined by their completion time, first place being the fastest and third
	 * place being the slowest (comparatively). Naturally, this information must be
	 * provided by the user through the console. The number of skiers participating
	 * in the competition cannot exceed 20.
	 */
	
	public static void main(String[] args) {

		String name; // stores the skier's name retrieved from user input.
		String answer; // stores the user's response to the additional skier prompt.
		double duration; // stores the skier's completion time (in seconds) retrieved from user input.

		String[] skiers = new String[20]; // responsible for storing all name variables.
		double[] times = new double[skiers.length]; // responsible for storing all duration variables.

		int count = 0; // ensures that the number of skiers never exceeds 20.
		int checker = 0; // ensures there are enough skiers to award the title of second and third place.

		// Displays the following text as instructed.
		System.out.println("Welcome to Mont-Halloween Skiing Contest Ranker.");
		System.out.println("Whenever a skier makes it to the finish line, enter their name and skiing time.");

		int firstPodiumIndex = 0; // index belonging to the smallest completion time.
		int secondPodiumIndex = 0; // index belonging to the second-smallest completion time.
		int thirdPodiumIndex = 0; // index belonging to the third-smallest completion time.

		// The conditional statement ensures that the program loops indefinitely until
		// the termination condition is true (ie: the maximum number of skiers has been
		// exceeded).
		while (count < 20) {

			// Retrieves the skier's name from the console as instructed,
			// which is subsequently stored in the skiers array.
			Scanner myKeyboard = new Scanner(System.in);
			System.out.print("Please input the skier's name: ");
			name = myKeyboard.nextLine();
			skiers[count] = name;

			// Retrieves the skier's completion time from the console as instructed,
			// which is subsequently stored in the times array.
			System.out.print("Please input the skier's time: ");
			duration = myKeyboard.nextDouble();
			times[count] = duration;

			// The program iterates to through the times array to determine which index
			// corresponds to the smallest completion time.
			for (int i = 0; i < times.length; i++) {
				if (times[i] < times[firstPodiumIndex] && times[i] > 0) {
					firstPodiumIndex = i;
				}
			}

			double smallestNumber = times[0];

			/*
			 * The conditional statement ensures there are enough skiers to award the title
			 * of second place. The program then iterates through the array to determine
			 * which index corresponds to a smaller completion time than first place.
			 */
			if (skiers[checker + 1] != null && skiers[checker + 2] == null) {
				for (int w = 0; w < times.length; w++) {
					if (w == firstPodiumIndex)
						continue;
					if (times[w] < smallestNumber) {
						smallestNumber = times[w];
						firstPodiumIndex = w;
						secondPodiumIndex = 0;
					} else {
						firstPodiumIndex = 0;
						secondPodiumIndex = 1;
					}
					if ((w + 1) > (times.length - 1) || skiers[w + 1] == null) {
						break;
					}
				}
			}

			smallestNumber = times[0];
			// The conditional statement ensures there are enough skiers to award the title
			// of third place.
			if (skiers[checker + 2] != null) {

				/*
				 * The program iterates through the array to determine which index corresponds
				 * to the second-smallest completion time. This is accomplished by repeatedly
				 * comparing each completion time to the reference number smallestNumber.
				 * 
				 * In addition, the program ensures the index belonging to the smallest
				 * completion time cannot be equivalent to the index of the second smallest
				 * completion time. The iteration is also terminated prior to reaching an index
				 * that has not yet been assigned anything.
				 */
				for (int z = 0; z < times.length; z++) {
					if (z == firstPodiumIndex)
						continue;

					if (times[z] == smallestNumber) {
						secondPodiumIndex = z;
						continue;
					}

					if (times[z] < smallestNumber) {
						if (skiers[z] == null)
							break;
						smallestNumber = times[z];
						secondPodiumIndex = z;
					}

					if ((z + 1) > (times.length - 1) || skiers[z + 1] == null) {
						break;
					}
				}

				/*
				 * Determines the index of the first valid completion time. That is the first
				 * completion time that isn't the smallest or second-smallest. The
				 * smallestNumber variable serves as the comparative "standard".
				 */
				for (int i = 0; i < times.length; i++) {
					if (i != firstPodiumIndex && i != secondPodiumIndex) {
						smallestNumber = times[i];
						break;
					}
				}

				/*
				 * The program iterates through the array to determine which index corresponds
				 * to the third-smallest completion time. This is accomplished by repeatedly
				 * comparing each completion time to the previously determined smallestNumber.
				 * 
				 * In addition, the program ensures the index belonging to the third-smallest
				 * completion time cannot be equivalent to the index of the second smallest
				 * completion time nor of the smallest completion time. The iteration is also
				 * terminated prior to reaching an index that has not yet been assigned
				 * anything.
				 */
				thirdPodiumIndex = 0;
				for (int q = 0; q < times.length; q++) {

					if (q == firstPodiumIndex || q == secondPodiumIndex)
						continue;

					if (times[q] == smallestNumber) {
						thirdPodiumIndex = q;
						continue;
					}

					if (times[q] < smallestNumber) {
						if (skiers[q] == null)
							break;
						smallestNumber = times[q];
						thirdPodiumIndex = q;
					}

					if ((q + 1) > (times.length - 1) || skiers[q + 1] == null) {
						break;
					}
				}
			}

			// Displays the following text as instructed.
			System.out.println("First Podium goes to " + skiers[firstPodiumIndex] + " who made it in "
					+ times[firstPodiumIndex] + " second(s)");

			// The conditional statement ensures there are enough skiers to award the title
			// of second place.
			if (skiers[checker + 1] != null)
				System.out.println("Second Podium goes to " + skiers[secondPodiumIndex] + " who made it in "
						+ times[secondPodiumIndex] + " second(s)");

			// The conditional statement ensures there are enough skiers to award the title
			// of third place.
			if (skiers[checker + 2] != null)
				System.out.println("Third Podium goes to " + skiers[thirdPodiumIndex] + " who made it in "
						+ times[thirdPodiumIndex] + " second(s)");

			// Displays the following text as instructed.
			System.out.print("Do you want to add another skier? y/yes: ");

			answer = myKeyboard.next(); // retrieves the user input response to the previous question.

			/*
			 * The program queries the user to decide whether they want to continue adding
			 * skiers. Should the user input anything other than the two authorized
			 * responses, being "y" and "yes" respectively, both the loop and the program
			 * will terminate.
			 */
			if (answer.equals("y") || answer.equals("yes")) {
				count++;
			} else {
				System.out.println("Goodbye!");
				break;
			}

		}

		System.out.println("Exceeded the limit of skiers entered.");
		System.out.println("Program Terminated.");
		System.exit(0);

	}

}
