#include <iostream>
#include <bits/stdc++.h>
 int reverse(int num)
  {
    static int rev=0;
    static int base=1;
    if(num>0){
    reverse(num/10);
      rev+=(num%10)*base;
      base*=10;
    }
    return rev;
  }
int main() 
{
	int num;
  std::cin>>num;
 std::cout<<reverse(num);    
}
