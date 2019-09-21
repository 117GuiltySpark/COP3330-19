package Klautky_p1;

import java.util.Scanner;

public class Encrypt 
{

	public static void main(String[] args) 
	{
		
     boolean keepRunning = true; 
	 int[] pin = new int[4 + 1];
	 int pinLength;
	 String userPin;
     Scanner input = new Scanner(System.in);
		  
		   do {
			   System.out.println("Enter a 4-digit pin to encrypt:");
		       userPin = input.next();
		       pinLength = userPin.length();
		  
		            if(pinLength != 4)
		            {
			         System.out.println("That's not a 4-digit pin... Try again.");
			         userPin = input.next();
			         pinLength = userPin.length();
		            }
		 	                                                                 // Reads string userPin character by character, then converts
		       pin[0] = (Integer.parseInt(userPin.substring(0,1)) + 7) % 10; // it to an integer so that math can be done to modify the pin.
		       pin[1] = (Integer.parseInt(userPin.substring(1,2)) + 7) % 10; // Then those integers are stored in pin[], an int array to make 
	           pin[2] = (Integer.parseInt(userPin.substring(2,3)) + 7) % 10; // the swapping of first digit with the third, and the second
	           pin[3] = (Integer.parseInt(userPin.substring(3,4)) + 7) % 10; // digit with the fourth super easy at the end. Some effort 
		                                                                     // through the website GeeksForGeeks allowed me to understand 
	           System.out.println("Encrypted pin is:");                      // the syntax for doing this, as it's far more convoluted than 
		       System.out.println("" + pin[2] + pin[3] + pin[0] + pin[1]);   // if it was in C. 
		       
		     
		      }while(keepRunning);
	 input.close(); 
	 return; 
	}

}
//Made by Noah Klautky, COP3330-19, TueThu 6:00PM - 7:15PM