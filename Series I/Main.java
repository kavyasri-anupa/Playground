#include<iostream>
float res=0.5;
float pow(int m,int e){
  if(e==0)
    return res;
while(e!=0){
  res*=m;
  e--;
  return res;
}
}
int main(){
  int num,n=0;
  std::cin>>num;
  while(n<num){
    std::cout<<pow(3,n)<<" ";
    n++;
  }
}