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
		
		
		if (correctCount == 8) {
			System.out.println("All tests passed");
		} else {
			System.out.println("At least one test failed");
		}
	}
	
	public static String translateScore (int score) { // Method to translate the score
		if (score == 2) { 							  // Test if score is 2
			return "safety";
		}
		else if (score == 3) {						  // Test if score is 3
			return "field goal";
		}
		else if (score == 6) {						  // Test if score is 6
			return "touchdown";
		}
		else if (score == 7) {						  // Test if score is 7
			return "touchdown and extra point";
		}
		else if (score == 8) {						  // Test if score is 8
			return "touchdown and 2-point conversion";
		}
		else if (score == 10) {						  // Test if score is 10
			return "you must be playing Quidditch ";
		}
		else if (score >= 0) {						  // Test for invalid scores (negative number)
			return "invalid";
		}
		else if (score < 0) {						  // Test for invalid scores
			return "";
		}
		
		return "";
	}
}
