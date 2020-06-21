#include<iostream>
using namespace std;
int factorial(int n){
  int fact=n;
  if(n==0){
    return 1;
  }
  else{
    fact*=factorial(n-1);
  }
  return fact;
}
int main()
{
  int num;
  cin>>num;
  cout<<"The factorial of "<<num<<" is "<<factorial(num);
}