#include<iostream>
int main()
{
   int n,first,last,sum=0;
    std::cin >> n;
    first = n/1000;
	last=n % 10;
	sum=first+last;
	std::cout<<sum;
}