/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

int
main ()
{
  int n = 133;
  int IsPrime=1;
  for(int i=2; i*i<n; i++)
  {
      if(n%i==0)
      {
          IsPrime=0;
          break;
      }
  }
  if (IsPrime==0)
  {
      cout<<"NO"<<endl;
  }
  else
  {
      cout<<"YES";
  }

  return 0;
}
