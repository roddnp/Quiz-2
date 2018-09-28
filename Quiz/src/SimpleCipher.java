import java.util.Scanner;

public class SimpleCipher 
{
	public static void main ( String[] args)
	{
		Scanner scan = new Scanner( System.in );
		
		System.out.print( "Enter shift " );
	    int shift = scan.nextInt();
	    
	    System.out.println( "Enter word " );
	    String word = scan.next();
	    
	    int length = word.length();
	    
	    for (int i =0;i<length;i++)
	    {
	    	char chr = word.charAt(i);
	 	    int asciiValue = (int)chr+shift;
	 	    if ( asciiValue > 122)
	 	    {
	 	    	asciiValue = (asciiValue-122)+97;
	 	    	System.out.print((char)asciiValue);
	 	    }
	 	    else
	 	    {
	 	    	System.out.print((char)asciiValue);
	 	    }
	    }
	    
	    
	}

}
