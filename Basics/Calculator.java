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
		System.out.println("Enter first number");
		int n1=s.nextInt();
		System.out.println("Enter second number");
		int n2=s.nextInt();
		System.out.println("Enter the desired operation");
		s.nextLine();
		char operation=s.nextLine().charAt(0);
		int result=0;
		
		switch (operation)
		{
		    case '+':
		        result=n1+n2;
		        break;
		    case '-':
		        result=n1-n2;
		        break;
		    case '*':
		        result=n1*n2;
		        break;
		    case '/':
		        result=n1/n2;
		        break;
		
		default:
		System.out.println("Invalid Operation");
		}
	System.out.println("Result is"+ result);
	
	}
}
