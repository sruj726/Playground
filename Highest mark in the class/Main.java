#include<iostream>
using namespace std;
int main()
{
    int i,n,a[25];
    cin>>n;
    for(i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for (i = 1; i < n; ++i) 
    {
        if (a[0] < a[i])
            a[0] = a[i];
    }
    cout<<a[0];

}