#include <iostream>
#include <cmath>
#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int a[n];
        int i;
        for(i=0; i<n; i++)
        {
            cin>>a[i];
        }
        sort(a,a+n);
        
        int result=0;
        int temp=0;
        
        for(i=0; i<n; i++)
        {
            if(i+1-a[i]<0)
            {
                temp=1;
                break;
            } 
            result=result+((i+1)-a[i]);
            
        }
        if(temp==1)
        {
            cout<<"Second"<<endl;
        }
        else
        {
            if(result%2==0)
            {
                cout<<"Second"<<endl;
            }
            else
            {
                cout<<"First"<<endl;
            }
        }
    }
	// your code goes here
	return 0;
}
