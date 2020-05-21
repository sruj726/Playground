#include<iostream>
#include<iomanip>
int main()
{
  int i,n;
  float m=0.0;
  
  for(i=0;i<3;)
  {
    std::cin>>n;
    if(n<0)
    {
      m=m-1;
    break;
    }
    else if(n%2==0)
    {
      m=m-0.5;
    }
    else
    {
      m=m+1;
    i++;
  }
  }
  std::cout<<m;
}