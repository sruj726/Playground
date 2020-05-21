#include<iostream>
using namespace std;
int main()
{
	int d1,c1,d2,c2,d3,c3;
  	std::cin>>d1;
    std::cin>>c1;
    std::cin>>d2;
    std::cin>>c2;
  	d3=d1+d2;
  	c3=c1+c2;
 	while(c3>100)
    {
      d3=d3+1;
      c3=c3-100;
    }
  	std::cout<<d3<<endl;
  	std::cout<<c3;
    
}