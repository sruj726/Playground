#include<iostream>
using namespace std;
int main()
{
  int a,t1=0,t2=1,count=0,i,temp;
  cin>>a;
  for(i=2;i<a;i++)
  {
    temp=t1+t2;
    t1=t2;
    t2=temp;
  }
  cout<<"The term "<<a<<" in the fibonacci series is "<<temp;
}