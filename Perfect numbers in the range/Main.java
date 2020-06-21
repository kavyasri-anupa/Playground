#include<iostream>
int main(){
  int x,y,sum;
  std::cin>>x>>y;
  for(int i=x;i<=y;i++){
    sum=0;
    for(int j=1;j<i;j++){
      if(i%j==0){
        sum+=j;}
    }
    if(sum==i)
     std::cout<<i<<" ";
  }
}
  