/*
* Kirsten Lucas
* lucaskt@mail.uc.edu
* Assignment 05
* Due Date: 3 Oct 2019
* Description: Football Fun
* Citations: 
* Course: IS4010
 */


/* Original documentation from Git: 
 * IS4010 Fall 2019
 * Assignment 05
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */

package footballFun;

import java.util.Scanner; // Imports scanner

public class FootballFun {

	public static void main(String[] args) {
		int correctCount = 0;
		if (translateScore(2).equals("safety") == true) { correctCount++;}
		if (translateScore(3).equals("field goal") == true) { correctCount++;}
		if (translateScore(6).equals("touchdown") == true) { correctCount++;}
		if (translateScore(7).equals("touchdown and extra point") == true) { correctCount++;}
		if (translateScore(8).equals("touchdown and 2-point conversion") == true) { correctCount++;}
		if (translateScore(-1).equals("") == true) { correctCount++;}
		if (translateScore(1).equals("invalid") == true) { correctCount++;}
		if (translateScore(10).equals("you must be playing Quidditch ") == true) { correctCount++;}
		
		Scanner input = new Scanner(System.in); // Creates a scanner to input score
			System.out.print("Enter football score: "); // Prompts user to enter score
			double score = input.nextDouble(); // Declares a double to hold the score
		
		if (correctCount == 8) {
			System.out.println("All tests passed");
		} else {
			System.out.println("At least one test failed");
		}
	}
	public static String translateScore (int score) {
		return "";
	}
}
