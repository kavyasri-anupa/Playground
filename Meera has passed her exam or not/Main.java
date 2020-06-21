#include<iostream>
using namespace std;
int main()
{
  int n,j=0,check=0;
  cin>>n;
  int a[n],marks;
  for(int i=0;i<n;i++){
    cin>>a[i];
  }
  cin>>marks;
  while(j<n){
    if(marks==a[j]){
     check=1;
      break;
    }
    j++;
  }
  if(check==1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
}

       