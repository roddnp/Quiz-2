import java.util.Scanner;

public class ThriceSimulator 
{
	
	public static void main ( String[] args)
	{
		
		
		
		int range = 6;
		int offset = 1;
		
		int value =0;
		int tally =0;
		int counter = 0;
		int role =0;
		   
		int count =0;
		while (true)
		{
			int firstRole =  (int)(Math.random()*range+offset);
			int secRole =  (int)(Math.random()*range+offset);
			int thirdRole =  (int)(Math.random()*range+offset);
			int calculation = firstRole + secRole + thirdRole;
			role+=1;
			count+=1;
		    
			if (firstRole == secRole && secRole == thirdRole)
			{
				int tripletsWorth = firstRole;
				for(int i =0;i<=tripletsWorth;i++)
				{
					value *= (int)(Math.random()*range+offset);
					tally +=value;
					
				}
				tally+=calculation;
				counter = tripletsWorth;
				System.out.println("Round 1 and 2 score is: "+ tally);
				break;
				
			}
			else
			{
				if (role%3==0)
				{
					tally -= calculation;
				}
				else
				{
					tally += calculation;
				}
			}
			
			
		}
		
		
		int count2 =0;
		while(count2 <1000)
    	{
    		int firstRole2 =  (int)(Math.random()*range+offset);
			int secRole2 =  (int)(Math.random()*range+offset);
			int thirdRole2 =  (int)(Math.random()*range+offset);
			count+=1;
		    
			if (firstRole2 == secRole2 && secRole2 == thirdRole2)
			{
				if (firstRole2 == counter)
				{
					tally*=3;
				}
				else
				{
					tally = firstRole2;
					break;
				}
			}
    	}
	    
	    	
	    
	   
		
		System.out.println(tally);
	}

}
