#include<iostream>
using namespace std;
int main()
{
  int x,y,z,w;
  cin>>x>>y>>z;
  w=75*y+30*z;
  if(w<x){
    cout<<"Boat is stable";
  }
  else
    cout<<"Boat will drow";  
}