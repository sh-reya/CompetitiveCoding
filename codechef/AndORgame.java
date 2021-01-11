/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes he
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
		    Set<Integer> set1 = new HashSet<>();
	     	Stack<Integer> stack = new Stack<>();
	    	int i = 0 , j =0;
	    	int n1= sc.nextInt();
		    int n2 = sc.nextInt();
		    set1.add(0);
		    stack.push(0);
		    
		    int a[] = new int[n1];
		    int b[] =  new int[n2];
		    
		    for( i = 0 ; i<n1 ;i++)
		    {
		        a[i] = sc.nextInt();
		    }
		    for( i = 0 ; i<n2 ;i++)
		    {
		        b[i] = sc.nextInt();
		    }
		    
		    
		    
		    while(!stack.isEmpty())
		   {
		       int num=(int)(stack.pop());
		       for(i=0; i<n1; i++)
		       {
		           int number=a[i];
		           if(!set1.contains(num|number))
		           {
		               set1.add(num|number);
		               stack.push(num|number);
		           }
		       }
		       
		       for(i=0; i<n2; i++)
		       {
		           int number=b[i];
		           if(!set1.contains(num&number))
		           {
		               set1.add(num&number);
		               stack.push(num&number);
		           }
		       }
		   }
		    System.out.println(set1.size());
		}
		  
	}
		   
		   
		
	}