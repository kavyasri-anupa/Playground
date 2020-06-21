#include<iostream>
using namespace std;
int main()
{
  int f,s,a;
  cin>>f>>s;
  if(s==00)
    a=100-f;
  else{
    if(f>s){
      a=100+s-f;
    }
    else
      a=s-f;
  }
  cout<<a;
}
  
