/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

int main()
{
    int n=5;
    int a=0;
    int b=1;
    cout<<a<<" "<<b<<" ";
    int c;
    for(int i=0; i<n-2; i++)
    {
        c=a+b;
        cout<<c<<" ";
        a=b;
        b=c;
    }
    //cout<<"Hello World";

    return 0;
}
