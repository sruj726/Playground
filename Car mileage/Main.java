#include<iostream>
using namespace std;
int main()
{
  float mileage;
  int petrol,dist,n;
  std::cin>>mileage;
  std::cin>>petrol;
  std::cin>>dist;
  n=mileage*petrol;
  if(n>dist)
    std::cout<<"Can reach"<<endl;
  else
    std::cout<<"Cannot reach"<<endl;
}