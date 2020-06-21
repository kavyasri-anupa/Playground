#include<iostream>
using namespace std;
int main()
{
  int num,a=11;
  cin>>num;
  for(int i=1;i<=num;i++){
    int seq=a*a;
    a=a+4;
    cout<<seq<<" ";
  }
}