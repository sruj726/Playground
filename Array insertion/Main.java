#include<iostream>
using namespace std;
 int main()
  {
  int n,i,a[100],no,pos;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  
  cout<<"Enter the elements in the array\n";
  for(i=0;i<n;i++)
  {
  cin>>a[i];
  }
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>pos;
  if(pos>n)
  {
  cout<<"Invalid Input\n";
  }
  else
  {
  cout<<"Enter the value to insert\n";
  cin>>no;
  --pos;
  for(i=5;i>=pos;i--)
  {
  a[i+1]=a[i];
  }
  a[pos]=no;
  cout<<"Array after insertion is\n";
  for(i=0;i<n+1;i++)
  {
  cout<<a[i]<<"\n";
  }
  }
  }