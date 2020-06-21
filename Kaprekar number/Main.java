#include<string>
#include<iostream>
using namespace std;
int main()
{
  int num,f,s;
  cin>>num;
  int sqrvalue=num*num;
  string str=to_string(num);
  int length=str.length();
  int div=1;
  for(int i=0;i<length;i++){
    div*=10;
    s=sqrvalue%div;
  f=sqrvalue/div;
  if(f+s==num){
    cout<<"Kaprekar Number";
    break;
  }
  
  }
  if(f+s!=num){
    cout<<"Not a Kaprekar Number";
  }
  }