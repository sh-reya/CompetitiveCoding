#include <iostream>
using namespace std;

int main() 
{
    int N,need,left;
    cin>>N>>need>>left;
    int flag=0;
    int options[N];
    for(int i=0; i<N; i++)
    {
        cin>>options[i];
    }
    for(int i=0; i<N; i++)
    {
        if((left+options[i])>=need)
        {
            flag=1;
            break;
        }
    }
    if(flag==1)
    {
        cout<<"Yes"<<endl;
    }
    else
    {
        cout<<"No"<<endl;
    }
	// your code goes here
	return 0;
}
