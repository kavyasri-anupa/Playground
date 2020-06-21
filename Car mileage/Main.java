#include<iostream>
using namespace std;
int main()
{
  float m;
    int p,d;
  cin>>m>>p>>d;
  if(((float)d/p)<=m)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
}