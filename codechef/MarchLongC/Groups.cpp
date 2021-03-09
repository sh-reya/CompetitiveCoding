#include <iostream>
using namespace std;

int main() 
{
    int t;
    cin>>t;
    while(t--)
    {
        string s;
        cin>>s;
        int Total_Group=0;
        int i=0;
        int size=s.size();
        
        while(i<size)
        {
            if(s[i]=='1')
            {
                Total_Group++;
                while(s[i]=='1')
                {
                    i++;
                }
            }
            else
            {
                i++;
            }
        }
        cout<<Total_Group<<endl;
    }
    cout<<endl;

	// your code goes here
	return 0;
}
