/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//Making calculator using switch case:

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first String");
		String a=s.nextLine();
		System.out.println("Enter the second String");
		String b=s.nextLine();
		
		boolean isAnagram =false;
		boolean visited[]=new boolean [b.length()];
		
		int i,j;
		
		if(a.length()!=b.length())
		{
		    System.out.println("Not anagram");
		}
		
		else
		{
		    for(i=0; i<a.length(); i++)
		    {
		        char c=a.charAt(i);
		        isAnagram=false;
		    
		    
		    for(j=0; j<b.length(); j++)
		    
		        if(b.charAt(j)==c)
		        {
		            isAnagram=true;
		            visited[j]=true;
		            break;
		        }
		    
		    
		    if(!isAnagram)
		    {
		        break;
		    }
		    }
		    
		    if(isAnagram)
		    {
		        System.out.println("Yes they are Anagrams");
		    }
		    else{
		        System.out.println("No, they are not Anagrams");
		    }
		}
		
	
	}
}
