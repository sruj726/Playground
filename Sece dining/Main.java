#include<iostream>
using namespace std;
int main()
{
int a;
  string ch;
  cin>>ch;
  cin>>a;
  if(ch=="front")
  {
    if(a==1)
    {
      cout<<"Left Handed";
    }
    else
    {
      cout<<"Right Handed";
    }
  }
    else if(ch=="rear")
    {
      if(a==1)
        cout<<"Right Handed";
      else
        cout<<"Left Handed";
    }
  else
    cout<<" ";
}