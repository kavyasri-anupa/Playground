#include<iostream>
int main(){
  int num;
  std::cin>>num;
  for(int i=1;i<=4;i++){
for(int j=1;j<=i;j++){
    std::cout<<num;
}
    std::cout<<"\n";
    num++;
  }
  num--;
   for(int i=1;i<=4;i++){
for(int j=4;j>=i;j--){
    std::cout<<num;
}
    std::cout<<"\n";
    num--;
  }
}
    