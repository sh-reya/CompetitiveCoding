#include <iostream>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--)
    {
        int n,k,x,y,b;
        cin>>n>>k>>x>>y;
        
        int kreq=k-1;
        int kfinal=kreq%4;
        int a[4][2];
        int l ,m,temp;
        
        if(x==y)
        {
            a[kfinal][0]=n;
            a[kfinal][1]=n;
            //cout<<n<<" "<<n<<endl;
        }
        else if(x>y)
        {
             int b= n-x;
                l=x+b; m = y+b;
                a[0][0] = l;
                a[0][1]=  m;
                
                //  a[0][0] = x+b;
                // a[0][1]=  y+b;
                
                temp =l;
                l=m;
                m=temp;
                a[1][0] = l;
                a[1][1] = m;
              
                
                
                b = l;
                l=l-b;  
                m=m-b;
                a[2][0] = l;
                a[2][1]=m;
                
                a[3][0] = m;
                a[3][1] =l;
            
        }
        else
        {
           int b = n-y;
	                l = x+b;
	                m = y+b;
	                a[0][0] = l;
	                a[0][1]= m;
	                
	                
	                temp =l;
	                l=m;
	                m=temp;
	                a[1][0] = l;
	                a[1][1] = m;
	                 
	                b=m;
	                l=l-b;
	                m=m-b;
	                 a[2][0] = l;
	                a[2][1]=m;
	                
	                
	                
	                  a[3][0] = m;
	                a[3][1] =l;
        }
        
        
        cout<<a[kfinal][0]<<" "<<a[kfinal][1]<<endl;
    }
	// your code goes here
	return 0;
}