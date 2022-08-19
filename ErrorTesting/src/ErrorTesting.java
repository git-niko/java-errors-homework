import java.util.Scanner;


public class ErrorTesting {

	public static void main(String[] args) {
		
		String promptQuestion = What is 24 divided by 4?; // quotes not used for string
		System.out.print(promptQuestion);
		
        Scanner scnr = new scanner(System.in); // lower case s used for Scanner
        String 1userInput = scnr.nextLine(); // beginning a variable with a number
        
       while(userInput != 6) { // Integer.parseInt(userInput) not used to compare
        	System.out.println("That is incorrect. Please try again.");
        	System.out.print(promptQuestion);
            userInput = scnr.nextLine() // missing semi-colon
        }
       
   	System.out.print("That's correct! Great job!!");

	}

}
