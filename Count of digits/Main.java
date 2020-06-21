#include<iostream>
int main()
{
  int x,count=0;
  std::cin>>x;
  if(x==0)
    count=1;
  else{
  while(x!=0){
      x/=10;
    ++count;
  }
  }
 
  std::cout<<count;
}