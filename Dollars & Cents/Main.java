#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1,c1,d2,c2;
  cin>>d1>>c1>>d2>>c2;
  int dol=d1+d2;
  int co=c1+c2;
  while(co>100){
    co-=100;
    dol+=1;
    break;
  }
  cout<<dol<<"\n"<<co;
}