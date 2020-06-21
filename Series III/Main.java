#include<iostream>
int main(){
  int num,a=6;
  std::cin>>num;
  for(int i=0;i<num;i++){
    a=a+i*5;
    std::cout<<a<<" ";
  }
}