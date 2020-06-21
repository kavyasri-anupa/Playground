#include<iostream>
int pow(int c,int d){
  int pow=1;
  int i=1;
  while(i<=d){
    pow*=c;
    i++;
}
  return pow;
}
int main()
{
    int n;
    std::cin>>n;
   int dig,res=0,count=0,m=n;
  while(m>0){
     m/=10;
    count+=1;
  }
  m=n;
  while(m>0){
    dig=m%10;
    res+=pow(dig,count);
    m/=10;
  }
    if(res==n)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}