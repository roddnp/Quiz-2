
public class Part0 
{
	public static void main ( String[] args)
	{
		
		int range = 6;
		int offset = 1;
		
		
		
		int value =0;
		int tally =0;
		
		
		
		
		boolean loop = true;
		boolean loop2 = true;
		    	
		while (loop)
		{
			int firstRole =  (int)(Math.random()*range+offset);
			int secRole =  (int)(Math.random()*range+offset);
			int thirdRole =  (int)(Math.random()*range+offset);
		    
			if (firstRole == secRole && secRole == thirdRole)
			{
				int tripletsWorth = firstRole;
				for(int i =0;i<=tripletsWorth;i++)
				{
					value *= (int)(Math.random()*range+offset);
					tally +=value;
					
				}
				loop = false;
			}
			while
			
			System.out.println("The final tally is: "+tally);
		}
		
		while (loop2)
		{
			int firstRole2 =  (int)(Math.random()*range+offset);
			int secRole2 =  (int)(Math.random()*range+offset);
			int thirdRole2 =  (int)(Math.random()*range+offset);
		    
			if (firstRole2 == secRole2 && secRole2 == thirdRole2)
			{
				if (firstRole2 == tripletsWorth)
				{
					tally*=3;
					loop = false;
				}
				else
				{
					tally = firstRole2;
					loop = false;
				}
			}
		}
		
	}
	

}
