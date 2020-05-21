#include<iostream>
using namespace std;
int main()
{
int p,r,t;
 float si,amt,dis,toamt;
 std::cin>>p;
  std::cin>>r;
  std::cin>>t;
  si=(p*r*t)/100;
  std::cout<<si;
  amt=si+p;
  std:cout<<"\n"<<amt;
  dis=(2*si)/100;
  std::cout<<"\n"<<dis;
  toamt=amt-dis;
  std::cout<<"\n"<<toamt;
}
