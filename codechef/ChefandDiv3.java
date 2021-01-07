/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
	    int t=s.nextInt();
	    while(t>=1) //10*3
	    {
	        int N=s.nextInt();
	        int K=s.nextInt();
	        int D=s.nextInt();
	        int a[]=new int [N];
	        int sum=0;
	        
	        for(int i=0; i<N; i++) //
	        {
	            a[i]=s.nextInt();
	            sum=sum+a[i];
	        }
	        
	            int poss=sum/K;
	            if(poss<D)
	            {
	                System.out.println(poss);
	            }
	            else{
	                System.out.println(D);
	            }
	            
	        
	       
	        t=t-1;
	    }
		// your code goes here
	}
}
