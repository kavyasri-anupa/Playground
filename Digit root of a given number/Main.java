#include<iostream>
using namespace std;
int main(){
  int n,result;
  cin>>n;
  if(n)
    result=n%9==0?9:n%9;
  else
    result=0;
  cout<<result;
}