#include<iostream>
using namespace std;
int main()
{
  int target,score,count=1,sum=0;
  cin>>target;
  cin>>score;
  while(score<target){
    int score1;
    cin>>score1;
    score+=score1;
    count+=1;
  }
  cout<<"The number of turns is "<<count;
}