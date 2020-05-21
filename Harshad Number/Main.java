#include<iostream>
using namespace std;
int main()
{
 int num,rem = 0, sum = 0,n;
  std::cin>>num;
  n=num;
    while(num > 0)
    {  
        rem = num%10;  
        sum = sum + rem;  
        num = num/10;  
    }  
  if(n%sum==0)
    std::cout<<"Harshad Number";
  else
    std::cout<<"Not Harshad Number";
}