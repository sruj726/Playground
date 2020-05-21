#include<iostream>
int main()
{
  int n,i,a,b;
  std::cin>>n;
    for(i=1;i<=n;i++)
    {
        if(i%2==0)
        {
        a=i*i-2;
        std::cout<<a<<" ";
        }
        else
        {
        b=i*i-1;
        std::cout<<b<<" ";
        }
    }
}
