#include<iostream>
int main(){
  int x,f=1;
  std::cin>>x;
  for(int i=1;i<=x;i++){
    f=f*i;
  }
  std::cout<<f;
}