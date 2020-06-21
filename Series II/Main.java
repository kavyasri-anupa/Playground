#include<iostream>
int main(){
int a,b,n,i,c;
  std::cin>>n;
  a=121;
  b=11;
  if(n==1)
    std::cout<<a;
  else{
    std::cout<<121<<" ";
    for (i=2;i<=n;i++){
      b+=4;
      c=b*b;
      std::cout<<c<<" ";
    }
  }
}
      