#include<iostream>
int main()
{
  int n,i,c=6,d=5;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    std::cout<<c<<" ";
    c=c+d;
    d=d+5;
  }
}