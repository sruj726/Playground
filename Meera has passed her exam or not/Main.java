#include<iostream>
using namespace std;
int main()
{
    int i,n,a[25],b,found=0;
    cin>>n;
    for(i=0;i<n;i++)
    {
        cin>>a[i];
    }
    cin>>b;
    for(i=0;i<n;i++)
    {
       
        if(a[i] == b)
        {
            found = 1;
            break;
        }
    }
    if(found==1)
    {
        cout<<"She passed her exam";
    }
    else
    cout<<"She failed";
}