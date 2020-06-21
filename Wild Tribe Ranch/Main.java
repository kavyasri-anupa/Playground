#include<iostream>
int main(){
  int mw,mf;
  std::cin>>mw>>mf;
  if(mw>mf)
    std::cout<<"Yes, you can enter.";
  else if(mw==mf)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
    std::cout<<"Sorry, you can't enter";
}  