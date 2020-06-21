#include<iostream>
using namespace std;
int main()
{
  int num;
  cin>>num;
  for(int i=1;i<=num;i++){
    int seq=i*i;
    if(seq%2==0)
      cout<<seq-2<<" ";
    else
      cout<<seq-1<<" ";
  }
}