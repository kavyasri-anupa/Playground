#include<iostream>
using namespace std;
int main()
{
  int num,dig,even=0,odd=0;
  cin>>num;
  while(num>0){
    dig=num%10;
    num/=10;
    if(dig%2==0)
      even+=dig;
    else
      odd+=dig;
  }
  if(odd==even)
    cout<<"Yes";
  else
    cout<<"No";
}