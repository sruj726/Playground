#include<iostream>
using namespace std;
int main()
{
int age;
float t,a=13.30;
  std::cin>>age;
  std::cin>>t;
  if(age>=13)
  {
  if(t!=a)
    {
      std::cout<<"$8.00";
    }
    else
    {
      std::cout<<"$5.00";
  }
  }
  else
  {
  
    if(t!=a)
    {
        cout<<"$4.00";
    }
    else
    {
        cout<<"$2.00";
    }
}
}