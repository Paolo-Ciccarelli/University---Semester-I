package questions;

//-------------------------------------------------------
//Assignment 1
//Written by: Paolo Ciccarelli 40286203
//For COMP 248 Section P – Fall 2023
//--------------------------------------------------------

public class A1_Q1 {

	//Algorithm 1: Simple Cipher Program
	
	/* Computes the resultant value for z with respect to the 6-piece puzzles illustrated
	 * in the provided instructions. The expected output will change depending on the operands 
	 * of the final three equations, however they must be changed prior to launching the program. */
	
	public static void main(String[] args) {
		
		System.out.println("Project-S Access System: 6-Piece Puzzle Authentication Challenge:");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	   
		/*The program will compute and output the different results 
	      depending on the integer values listed below.*/
		
		int a = 104;
		int b = 25;
		int c = 2;
		int d = 1;
		int e = 205;
		int f = 100;
		
		//Displays the operands with the instructed format.
		String puzzle = "7 @ 5   8 @ 3   4 @ 2" + "   " + a + " @ " + b + "   " + c + " @ " + d + "   " + e + " @ " + f;
	    System.out.println(puzzle);
		
		//Formats the subsequent line such that the '|' characters are always directly beneath the '@' characters from the "puzzle" string.
		System.out.println(puzzle.replaceAll("[0-9]", " ").replace('@', '|'));
		
		/* The solution to the puzzle is the algorithm: (x / y + x%y).
		    7 / 5 + 7%5 = 3 which is the expected value according to the sample outputs.
			8 / 3 + 8%3 = 4 which is the expected value according to the sample outputs.
		    4 /2 + 4%2 = 2 which is the expected value according to the sample outputs. */
		
		/* This next section formatted the "answer" string such that the solution to the algorithm is always directly beneath the '|' and '@' characters.
		   The strategy here was to create a new string called "solution" with equal length to the "puzzle" string above, albeit completely filled with blanks.
		   
		   The "answer" string was created by gradually concatenating various portions of the "solution" string.
           Sections of the "solution" string were concatenated up until the index where an '@' character existed in the original "puzzle" string.
           The corresponding algorithm solution would then be added at that index.
           From then on the above steps would repeat, the only differences being the indexes of the concatenated string and the algorithm solution inserted.
           Regardless of the values of a,b,c,d,e,f this algorithm ensures that the instructed format is always maintained. */
		
		String solution = puzzle.replaceAll(".", " ");
		String answer = solution.substring(0,2) + "3" 
						+ solution.substring(3,10) + "4" 
						+ solution.substring(10,17) + "2" 
						+ solution.substring(19, puzzle.indexOf('@',19)) + (a/b + a%b)
						+ solution.substring(puzzle.indexOf('@',19) + 1, puzzle.indexOf('@',34)) + (c/d + c%d)
						+ solution.substring(puzzle.indexOf('@',34) + 1, puzzle.lastIndexOf('@')) + (e/f + e%f); 

		System.out.println(answer);
		System.out.println("At Project-S, we employ multi-factor authentication because one password is never enough.");
		
	}

}
