#include<iostream>
using namespace std;
int main()
{
  int h,sum=0,t;
  cin>>h;
  t=h;
  while(h>0){
    int d=h%10;
    sum+=d;
    h/=10;
  }
  if(t%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}