package questions;
import java.util.Scanner;

//-------------------------------------------------------
//Assignment 1
//Written by: Paolo Ciccarelli 40286203
//For COMP 248 Section P – Fall 2023
//--------------------------------------------------------

public class A1_Q2 {

	//Algorithm 2: Simple Travel-Time Computer
	
	/* Computes the duration of any spaceship voyage (in Earth days) from the Earth's surface to any extraterrestrial body.
	 * The user must provide the distance (in km) between both celestial objects for the algorithm to function as intended.
	 * The spaceship is assumed to be travelling constantly at 28,000 miles/hour. */
	
	public static void main(String[] args) {
		
		//This scanner will retrieve user inputs in the console.
		Scanner myKeyboard = new Scanner(System.in); 
		
		System.out.println("Project-S Simple Trave-Time Computer:");
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println();

		//Displays a prompt message as instructed.
		System.out.print("Please enter the distance (in km) between the Earth and the extraterrestrial body: ");
		
		/* Retrieves the user's input (the distance) as a double (to account for decimal numbers),
		 * then divides the distance by the spaceship's travel speed to determine the duration in hours of the voyage.
		 * Finally, the duration is converted from hours to Earth days (24 hours = 1 Earth Day).
		 * 
		 * Note that the spaceship's travel speed has been converted from (miles/hour) to (kilometers/hour).
		 * Note that an additional 0.5 was added for rounding purposes.*/
		
		double distance = myKeyboard.nextDouble();
		int travelDuration = (int) ((distance/(28000 * 1.61) / 24) + 0.5);

		//Displays the results in the instructed format.
		System.out.println("Project-S spaceship, constantly travelling at 28000mi/h, will take approximately");
		System.out.println(travelDuration + " 'Earth-base days' to get to its foreknown extraterrestrial destination.");
		System.out.println();
		System.out.println("Thank you for your contribution to Project-S.");
		
		myKeyboard.close();
	}

}
