#include<iostream>
int main(){
int num,j,k=1;
  std::cin>>num;
  for(int i=1;i<=num;i++){
    for(int j=1;j<=i;j++){
      std::cout<<k;
      if(k!=j)
        std::cout<<"*";
    }
     k= k+1;
    std::cout<<"\n";
  }
  k--;
  for(int i=num;i>=1;i--){
    for(int j=1;j<=i;j++){
      std::cout<<k;
      if(k!=j)
        std::cout<<"*";
    }
     k= k-1;
    std::cout<<"\n";
  }
}