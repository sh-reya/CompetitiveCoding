#include <iostream>
using namespace std;
long long int min(long long int a,long long int b)
{
	if(a<b)
		return a;
	return b;
}
long long int max(long long int a,long long int b)
{
	if(a>b)
		return a;
	return b;
}
long long int solution(long long int n,long long int e,long long int h,long long int a,long long int b,long long int c)
{
	if(n<=0)
		return 0;
	
	long long ans=1e15;
	if(2*n<=e) //All orders are of omelette 
	{
		ans=min(ans,n*a);
	}
	if(3*n<=h) //All orders are of Milkshake
	{
		ans=min(ans,n*b);
	}
	if(n<=e && n<=h) //All orders are of cake
	{
		ans=min(ans,n*c);
	}
	if( ((h-n)/2>=1) && ((h-n)/2 >= n-e) ) // milkshake and chocolate cake
	{
		if(b-c<0)
		{
			long long int temp=min(n-1,(h-n)/2);
			ans=min(ans,(b-c) * temp + n*c );
				
		}
		else
		{
			long long int temp=maxv(1,n-e);
			ans=min(ans,(b-c)*temp+n*c); 
		}
	}
	if(e-n>=1 && e-n >= n-h) //Omelettes and cakes
	{
		if(a-c<0)
		{
			long long int temp=min(n-1,e-n);
			ans=min(ans,(a-c)*temp + n*c);
		}
		else
		{
			long long int temp=max(1,n-h);
			ans=min(ans,(a-c)*temp+n*c);
		}
	}
	if((e/2>=1) && (e/2>=(3*n-h+2)/3) ) //Milkshakes and omelette
	{
		if(a-b<0)
		{
			long long int temp=min(n-1,e/2);
			ans=min(ans,(a-b)*temp+n*b);
		}
		else
		{
			long long int temp=max(1,(3*n-h+2)/3);
			ans=min(ans,(a-b)*temp+n*b);
		}
	}
	if(e>=3 && h>=4 && n>=3)
	{
		ans=min(ans,a+b+c+res(n-3,e-3,h-4,a,b,c));
	}
	return ans;
}	
int main() {
	// your code goes here
	long long int t;
	cin>> t;
	while(t--)
	{
		long long int n,e,h,a,b,c;
		cin>>n>>e>>h>>a>>b>>c;
		
		long long int ans;
		ans=solution(n,e,h,a,b,c);
		
		if(ans==1e15)
		{
			cout<<-1<<endl;
		}
		else{
			cout<<ans<<endl;
		}
		
	}
	return 0;
}


