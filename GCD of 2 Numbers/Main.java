#include<iostream>
using namespace std;
int main()
{
  int i=2,m,n,gcd=1;
  cin>>m>>n;
  for(int i=1;i<=m && i<=n;i++){
    if(m%i==0 && n%i==0){
      gcd=i;
    }
  }
  cout<<"G.C.D of "<<m<<" and "<<n<<" = "<<gcd;
}