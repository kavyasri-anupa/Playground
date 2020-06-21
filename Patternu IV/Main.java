#include <iostream>
using namespace std;
int main() {
    int num,k=1;
  cin>>num;
  for(int i=1;i<=num;i++){
    if(i%2!=0){
      for(int j=1;j<num;j++){
      cout<<k;
      }
      cout<<k+1;
    k++;
    cout<<"\n";
    }
    else{
      cout<<k+1;
      for(int j=1;j<num;j++){
        cout<<k;
      }
      k++;
      cout<<"\n";
  }
  }
}