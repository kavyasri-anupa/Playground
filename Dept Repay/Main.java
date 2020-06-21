#include<iostream>
using namespace std;
int main()
{
  int p,r,y;
  cin>>p;
  cin>>r;
  cin>>y;
  float i,a,d,f;
  i=(p*r*y)/100;
  a=p+i;
  d=0.02*i;
  f=a-d;
  cout<<i<<endl;
  cout<<a<<endl;
  cout<<d<<endl;
  cout<<f<<endl;
}