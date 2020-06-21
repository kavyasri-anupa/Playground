#include<iostream>
using namespace std;
int main()
{
  int su,m,t,w,th,f,s,sum=0;
  cin>>su>>m>>t>>w>>th>>f>>s;
  if(su!=0 || s!=0){
    sum+=su*100+((su*100)*0.5);
    sum+=s*100+((s*100)*0.25);
  }
  if(m>8){
    sum+=(m-8)*15;
  } 
  if(t>8){ 
    sum+=(t-8)*15;
  } 
  if(w>8){
    sum+=(w-8)*15;
  } 
  if(th>8){
    sum+=(th-8)*15;
  } 
  if(f>8){
    sum+=(m-8)*15;
  }
  if((m+t+w+th+f)>40){
    sum+=25*((m+t+w+th+f)-40);
  }
  sum+=(m+t+w+th+f)*100;
  cout<<sum;
  
}