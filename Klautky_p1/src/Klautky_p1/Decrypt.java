package Klautky_p1;

import java.util.Scanner;

public class Decrypt 
{

	public static void main(String[] args) 
	{
		
	 boolean keepRunning = true; 
	 int[] pin = new int[4 + 1];
	 int pinLength;
	 String userPin;
     Scanner input = new Scanner(System.in);
		  
		   do {
			   System.out.println("Enter a 4-digit pin to decrypt:");
		       userPin = input.next();
		       pinLength = userPin.length();
		  
		            if(pinLength != 4)
		            {
			         System.out.println("That's not a 4-digit pin... Try again.");
			         userPin = input.next();
			         pinLength = userPin.length();
		            }
		 		                                                                     
		       pin[0] = (Integer.parseInt(userPin.substring(0,1)) + 3) % 10; // Same thing applies here, just flipped some numbers 
		       pin[1] = (Integer.parseInt(userPin.substring(1,2)) + 3) % 10; // and the order around so that it decrypted the pin.
	           pin[2] = (Integer.parseInt(userPin.substring(2,3)) + 3) % 10; 
	           pin[3] = (Integer.parseInt(userPin.substring(3,4)) + 3) % 10;
		   
	           System.out.println("Decrypted pin is:");
		       System.out.println("" + pin[2] + pin[3] + pin[0] + pin[1]);
		       
		     
		      }while(keepRunning);
	 
     input.close(); 
     return; 
	}

}
//Made by Noah Klautky, COP3330-19, TueThu 6:00PM - 7:15PM
