#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
   int f,s,t,p,max,h=1,size=3;
  cin>>f>>s>>t;
  int a[3]={f,s,t};
  sort(a,a+size);
  p=f*s*t;
  for(int i=2;i<=p;i++){
    if(f%i==0 && s%i==0 && t%i==0){
      h=i;
      break;
    }
  }
  cout<<"The treasure is in box which has number "<<a[1];
  cout<<"\nThe code to open the box is "<<h;
}
