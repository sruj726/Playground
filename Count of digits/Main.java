#include<iostream>
int main()
{
  int n,Count;
  std::cin>>n;
do
  {
     n = n / 10;
     Count = Count + 1;  
  } while(n > 0);
  std::cout<<Count;
 
}