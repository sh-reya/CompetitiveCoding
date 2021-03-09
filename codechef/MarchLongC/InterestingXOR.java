class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
	    long t=s.nextInt();
	    while(t>0)
	    {
	        long c=s.nextInt();
	        long temp=c;
	        long i =(long)(Math.log(temp) / Math.log(2)); 
	        long a=(long)Math.pow(2,i)-1;
	        long b;
	        //a^b=c (given)
	        //a^a^b=a^c (xor on both sides)
	        //0^b=a^c (got the value of b)
	        
	        b=a^c;
	        long pdt=a*b;
	        System.out.println(pdt);
	        t--;
	    }
		// your code goes here
	}

	
}
