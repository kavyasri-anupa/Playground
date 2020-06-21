#include<iostream>
#include<string>
using namespace std;
int main()
{
  string door;
  int r;
  cin>>door>>r;
  if(door=="front"){
    if(r==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  else{
    if(r==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
  }
}