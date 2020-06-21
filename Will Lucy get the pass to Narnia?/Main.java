#include<iostream>
int main(){
int f,s,m;
  std::cout<<"Enter first number : ";
  std::cout<<"Enter second number : ";
  std::cout<<"Menu\n";
  std::cin>>f;
  std::cin>>s;
  std::cin>>m;
  std::cout<<"1.Addition\n";
  std::cout<<"2.Subtraction\n";
  std::cout<<"3.Multiplication\n";
  std::cout<<"4.Division\n";
  std::cout<<"5.Remainder\n";
  switch(m){
    case 1:
      std::cout<<f+s;
      break;
    case 2:
      std::cout<<f-s;
      break;
    case 3:
      std::cout<<f*s;
      break;
      case 4:
      std::cout<<f/s;
      break;
     case 5:
      std::cout<<f%s;
      break;
    default:
      std::cout<<"Invalid operation";
  }
}
  