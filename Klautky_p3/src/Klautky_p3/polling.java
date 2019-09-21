package Klautky_p3;
import java.util.Scanner; 

public class polling 
{

 public static void main(String[] args) 
 {
  Scanner input = new Scanner(System.in);
  String[] topics = {"Security of information: ", "Microtransactions: ", "Inflation: ", "Parking at UCF: ", "Price of textbooks: "};
  int[][] responses = new int[topics.length][10 + 1];
  double avgRating[] = new double [topics.length];
  String mostLikedTopic = "";
  String leastLikedTopic = "";
  double highTotalRating = 0; 
  double lowTotalRating = 0;
  int numPeople; 
  int userRating; 
  int i;
  int j;
  
        
  System.out.println("How many people will take this survey?");
  numPeople = input.nextInt();
  
                                      //prompts user for the amount of people that the survey will have to loop through
		for(i = 0; i < numPeople; ++i)
		{
		 System.out.println("Give a rating to each topic: 1 (Least Important) - 10 (Most Important)\n");
		 
		        for(j = 0; j < topics.length; j++)
			    {
				 System.out.print(topics[j]);
				 userRating = input.nextInt();
				
				responses[j][userRating - 1]++;
			    }
		        
		       
		}	
		
		
		// initializes and loops through for avgRating, then compares to see if its higher or lower than the others 	
		for(i = 0; i < responses.length; i++)
		{
				avgRating[i] = 0;
				
				for(j = 0; j < responses[i].length; j++)
				{
					avgRating[i] = avgRating[i] + (responses[i][j] * (j + 1));
				}
			
			
		        if(i == 0) // Initializes so things work right
			    {
				 highTotalRating = avgRating[i];
                 lowTotalRating= avgRating[i];
                 mostLikedTopic = topics[i];
                 leastLikedTopic = topics[i];
			    }
			
		        
				else // compares to find the most liked and least liked topic and it rating
			    {
				
				        if(avgRating[i] > highTotalRating)
				        {
					    mostLikedTopic = topics[i];
					    highTotalRating = avgRating[i];
			         	}
				
				        
				        if(avgRating[i] < lowTotalRating)
				        {
					     leastLikedTopic = topics[i];
					     lowTotalRating = avgRating[i];
				        }
			    }
			
		        
		 Double.valueOf(avgRating[i] = avgRating[i] / numPeople); // makes it so the average is not just an integer when dividing
			
		}
		
	
 System.out.println("-------------------------------------------------------------------------");
 System.out.println("|         Topic          | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | Avg |");
 System.out.print("-------------------------------------------------------------------------");
       
		// loop through i to print out the topics down the left side
        for(i = 0; i < responses.length; i++)
        {
         System.out.printf("\n%-25s|",topics[i]);
               
               for(j = 0; j < 10; j++)
               { 
            	   System.out.printf(" %d |", responses[i][j]); // prints out the user values to form a grid 
               }
               
         System.out.printf("|%2.2f |", avgRating[i]); // prints out the average down the last column on the right
        }
       
  System.out.println();
  System.out.print("-------------------------------------------------------------------------\n");
  System.out.printf("Most important topic--> %s With a point total of %.1f!\n", mostLikedTopic, highTotalRating);
  System.out.printf("Least important topic--> %s With a point total of %.1f!\n", leastLikedTopic, lowTotalRating);
  
  input.close();     
 }
 
}
//Made by Noah Klautky, COP3330-19, TueThu 6:00PM - 7:15PM		
		
		
		
		
		    
	


