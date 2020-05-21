#include<iostream>
int main()
{
int n,c;
std::cin >> n;
if(n<=200)
{
c=(n*5)/10;
std::cout<<"Rs."<<c;
}
else if(n<=400)
{
c=((n*65)/100)+100;
std::cout<<"Rs."<<c;
}
else if(n<=600)
{
c=((n*80)/100)+200;
std::cout<<"Rs."<<c;
}
else
{
c=((n*125)/100)+425;
std::cout<<"Rs."<<c;
}
}