#include<iostream>
using namespace std;
int swap(int *a,int *b)
{
  int temp;
  temp=*a;
  *a=*b;
  *b=temp;
  cout<<"After swapping a= "<<*a<<" and b="<<*b<<endl;
}
int main()
{
  int n1,n2;
  cin>>n1;
  cin>>n2;
  cout<<"Before swapping a= "<<n1<<" and b="<<n2<<endl;
  swap(&n1,&n2);
  return 0;
}