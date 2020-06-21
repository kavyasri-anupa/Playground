#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main()
{
  int b,r,rs,nb,o,ov,rov;
  float of,crr,trr;
  cin>>b>>r>>rs>>nb;
  o=b/6;
  ov=(nb/6);
  rov=(nb%6);
  of=((float)ov+(float)rov/10);
  crr=rs/of;
   trr=(float)r/(float)o;
  cout<<o<<"\n"<<fixed<<setprecision(1)<<of<<"\n"<<crr<<"\n"<<trr<<"\n";
  if(crr>trr)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
}