#include<iostream>
int main()
{
    int t1=0,t2=1,i,n,n2;
    std::cin>>n;
    for(i=2;i<n;i++)
    {
        n2=t1+t2;
        t1=t2;
        t2=n2;
    }
    std::cout<<n2;
}