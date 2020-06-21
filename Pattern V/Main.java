#include<iostream>
using namespace std;
int main(){
  int n,k=1,s=0,i=1,num=1,number;
  cin>>n;
  number=n;
  for(i=0;i<n;i++){
    for(int m=1;m<=s;m++)
      cout<<"-";
  for(int j=1;j<2*n-s;j++){
    if(j%2==0)
       cout<<"*";
     else
        cout<<num++;
  }
    cout<<"*";
    for(int t=1;t<2*n-s;t++)
    {
      if(t%2==0)
        cout<<"*";
      else
      {
        cout<<k+number*number;
        k++;
      }
    }
    number--;
    s+=2;
    cout<<endl;
  }
}
