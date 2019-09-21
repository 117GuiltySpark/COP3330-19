package Klautky_p2;

import java.util.Scanner;
import java.lang.Math;

public class BMI 
{

	public static void main(String[] args) 
    {
	 Scanner input = new Scanner(System.in);
	 
	 double weightInPounds;
	 double weightInKilos;
	 
	 double heightInInches;
	 double heightInMeters; 
	 
	 double bmi;
	 
	 int userIn; 
	 
	 boolean runTime = true; 
	 
	 
	 System.out.println("What type of measurements do you want to use?");
	 System.out.println("-> Press 1 for USC");
	 System.out.println("-> Press 2 for Metric");
	 
	 userIn = input.nextInt(); 
	 
	 
	    while(runTime == true) 
        {
	    	
	      if(userIn == 1)
	      {
		   System.out.println("Enter pounds:");
		   weightInPounds = input.nextDouble(); 
		   System.out.println();
		   
		   System.out.println("Enter feet:");
		   heightInInches = input.nextDouble();  
		   heightInInches = heightInInches * 12; // converts to feet entered by user into actual inches
		   System.out.println();
		   
		   bmi = (703 * weightInPounds)  / Math.pow(heightInInches, 2.0);
		   bmi = Math.round(bmi * 10) / 10.0; // rounds the number 
		   
		   
		   System.out.println("BMI Catagories:");
		   System.out.println("*|Underweight is <18.5");
		   System.out.println("*|Normal weight is 18.5 - 24.9");
		   System.out.println("*|Overweight is 25 - 29.9");
		   System.out.println("*|Obese is 30+");
		   System.out.println();
		   System.out.printf("*Your BMI is %.1f*\n", bmi);
		   runTime = false; 
	      }
	 
	      else if(userIn == 2)
	      {
	       System.out.println("Enter kilograms:");
		   weightInKilos = input.nextDouble(); 
		   System.out.println();
			   
		   System.out.println("Enter meters:");
		   heightInMeters = input.nextDouble();   
		   System.out.println();
	    	  
		   bmi = weightInKilos / Math.pow(heightInMeters, 2.0);
		   bmi = Math.round(bmi * 100) / 100.0;
		   
		   
		   System.out.println("BMI Catagories:");
		   System.out.println("*|Underweight is <18.5");
		   System.out.println("*|Normal weight is 18.5 - 24.9");
		   System.out.println("*|Overweight is 25 - 29.9");
		   System.out.println("*|Obese is 30+");
		   System.out.println();
		   System.out.printf("*Your BMI is %.1f*\n", bmi);
		   runTime = false; 
	      } 
	      
	      else 
	      {
	       System.out.println("An invalid key was pressed");
	       System.out.println("-> Press 1 for USC");
	       System.out.println("-> Press 2 for Metric");

	       userIn = input.nextInt();
	      }
	      
        }
	  input.close(); // closes the scan, not sure the benefit of it though
	  return; // I don't know how necessary this is in java, but C taught me to
	 }
	  

}
//Made by Noah Klautky, COP3330-19, TueThu 6:00PM - 7:15PM
