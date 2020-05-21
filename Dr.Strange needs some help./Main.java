#include<iostream>
#include<cmath>
using namespace std;
int bact(int m,int n)
{
   int r=pow(m,n);
    return r;
}
int main()
{
    int a,b,c,d;
    cin>>b;
    cin>>c;
    cin>>d;
    a=bact(b,c);
    if(a>=d)
    {
    cout<<"Doctor, you can proceed with your experiment."<<endl;
    }
    else
    {
    cout<<"Sorry Doctor! You need more bacteria."<<endl;
    }
}