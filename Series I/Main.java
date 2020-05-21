#include<iostream>
int main()
{
  float n,i,b=0.5;
  std::cin>>n;
  std::cout<<b<<" ";
  for(i=1;i<n;i++)
  {
    b=b*3;
    std::cout<<b<<" ";
  }
}
