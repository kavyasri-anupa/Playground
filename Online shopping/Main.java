#include<iostream>
using namespace std;
int main()
{
  int fa,fd,fs,sa,sd,ss,aa,ad,as,fp,sp,ap;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as>>fp>>sp>>ap;
  fp=fa-((float)fd/100.0)*fa+fs;
  sp=sa-((float)sd/100.0)*sa+ss;
  ap=aa-((float)ad/100.0)*aa+as;
  cout<<"In Flipkart Rs."<<fp<<"\n"<<"In Snapdeal Rs."<<sp<<"\n"<<"In Amazon Rs."<<ap<<"\n";
  if(sp<fp && sp<ap)
    cout<<"He will prefer Snapdeal";
  else if(fp<ap)
    cout<<"He will prefer Flipkart";
  else
    cout<<"He will prefer Amazon";
  
}