#include<iostream>
#include<iomanip>
#include<cmath>
using namespace std;
int main()
{
int a;
  float b,x;
  cin>>a>>b;
  switch(a)
  {
    case 2:x=b+(b*50/100);
      cout<<fixed<<setprecision(2)<<x;
      break;
    case 3: x=b*2.00;
      cout<<fixed<<setprecision(2)<<x;
      break;
    default:cout<<"Number of items is more";
      return 0;
  }
}