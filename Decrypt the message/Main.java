#include<iostream>
int main(){
  int e,t,n,sum=0;
  std::cin>>e>>t;
  n=e+t;
  for(int i=1;i<n;i++){
    if(n%i==0)
      sum+=i;
  }
  if(sum==n)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
}