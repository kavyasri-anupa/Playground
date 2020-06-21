#include<iostream>
using namespace std;
int main()
{
  int e,b;
  cin>>e;
  if(e<=200)
    b=e*0.5;
  else if(e<=400)
    b=e*0.65+100;
  else if(e<=600)
    b=e*0.80+200;
  else 
    b=e*1.25+425;
  cout<<"Rs."<<b;
}
    