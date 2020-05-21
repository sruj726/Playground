#include<iostream>
using namespace std;
int main()
{
int i,j,r,c,t,a[20][20],count=1,m=0;
  std::cin>>r;
  std::cin>>c;
  std::cin>>t;
  for(i=1;i<=r;i++)
  {
    for(j=1;j<=c;j++)
    {
      a[i][j]=count;
      count++;
    }
  }
  for(i=1;i<=r;i++)
      {
        if(t==a[2][i]||t==a[c-1][i])
        {
          m++;
        }
      }
      if(m==1)
      {
        std::cout<<"It is a mango tree";
      }
      else
      {
        std::cout<<"It is not a mango tree";
      }
      
}