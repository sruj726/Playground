#include<iostream>
#include<iomanip>
#include<cmath>
using namespace std;
int main()
{
  int tb,tr,cr,cb;
  cin>>tb;
  cin>>tr;
  cin>>cr;
  cin>>cb;
  int overs=tb/6;
  cout<<overs<<endl;
  float overfin=cb/6;
  float r=cb-(overfin*6);
  r=r/10;
  overfin=overfin+r;
  cout<<overfin<<endl;
  float crr=cr/overfin;
  cout<<fixed<<setprecision(1)<<crr<<endl;
  float trr=float(tr)/float(overs);
  cout<<trr<<endl;
  if(trr>crr)
    cout<<"Not Eligible to Win";
  else
    cout<<"Eligible to Win";  
}