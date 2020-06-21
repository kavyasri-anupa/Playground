#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  int *p,n,even=0,odd=0;
  cin>>n;
  p=(int *) malloc(n*sizeof(int));
  for(int i=0;i<n;i++){
      cin>>*(p+i);
  }
  for(int i=0;i<n;i++){
      if(*(p+i)%2==0)
        even+=1;
       else
         odd+=1;
  }
  cout<<odd<<"\n"<<even;
  
}