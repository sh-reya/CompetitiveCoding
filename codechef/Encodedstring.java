/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s= new Scanner(System.in);
	    char[] a1={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'};
	    char[] temp=a1;
	    int count=0;
	    int t=s.nextInt();
	    for(int i=0; i<t; i++)
	    {
	        int num=s.nextInt();
	        s.nextLine();
	        String str=s.nextLine();
	        
	        
	        for(char c : str.toCharArray())
	        {
	            count++;
	            if(c == '0')
	            {
	                a1 = Arrays.copyOfRange(a1,0,a1.length/2);
	            }
	            else
	            {
	                a1=Arrays.copyOfRange(a1,a1.length/2,a1.length);
	                
	            }
	            if(count%4==0)
	            {
	                System.out.print(a1[0]);
	                a1=temp;
	            }
	        }
	        System.out.println();
	    }
	    
		// your code goes here
	}
}
