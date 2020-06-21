#include<iostream>
using namespace std;
int main()
{
  int age;
  float time,matinee=13.30;
  cin>>age>>time;
  
  if(age>13 && time==matinee)
    cout<<"$5.00";
  else if(age>13 && time!=matinee)
    cout<<"$8.00";
  else if(age<=13 && time==matinee)
    cout<<"$2.00";
  else
    cout<<"$4.00";
}
