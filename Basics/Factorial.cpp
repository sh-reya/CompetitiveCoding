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
    int fact=1;
    for(int i=1; i<=n; i++)
    {
        fact=fact*i;
    }
    cout<<fact;

    return 0;
}
