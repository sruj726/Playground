#include<iostream>
#include<cmath>
using namespace std;
int main()
{
    int a,b,c,hcf,st,d;
    cin>>a;
    cin>>b;
    cin>>c;
    cin>>d;
 	st=a<b?(a<c?a:c):(b<c?b:c);
	 for (hcf=st;hcf>=1;hcf--)
 	{
  	  if (a%hcf==0 && b%hcf==0 && c%hcf==0)
  		 break;
 	} 

 	if(a==d)
 	{
 	    cout<<"Answer is correct.";
 	}
 	else
 	    cout<<"Answer is wrong.";
 return 0;
    
    
}