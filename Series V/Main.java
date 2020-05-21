#include<iostream>
using namespace std;
int main()
{
  int n,i,a,b=11;
  std::cin>>n;
  std::cout<<b*b<<" ";
  for(i=1;i<n;i++)
  {
    a=(11+4*i)*(11+4*i);
    std::cout<<a<<" ";
  }
}