#include <iostream>
using namespace std;
int main()
{
    int a[10],i,n,c=0,d=0;
    cin>>n;
    for(i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for(i=0;i<n;i++)
    {
    if(a[i]%2!=0)
    {
        c=c+1;
    }
    else
    {
    d=d+1;
    }
    }
    cout<<c<<"\n";
    cout<<d;
}
