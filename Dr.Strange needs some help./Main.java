#include<iostream>
int exp(int a,int b){
  int mult=1;
  while(b>0){
    mult*=2;
    b--;
}
  return mult;
}
int main(){
  int m,n,req,res=0;
  std::cin>>m>>n>>req;
  res=exp(m,n);
  if(res>=req)
    std::cout<<"Doctor, you can proceed with your experiment.";
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
}