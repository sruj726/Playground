#include <iostream>
using namespace std;
int main() {
    int n,i=1;
  cin>>n;
  while(i<=n)
  {
    if(i%2!=0)
    {
      for(int j=1;j<=n-1;j++){
        cout<<i;
      }
      cout<<i+1<<endl;
      
    }
    else{
      cout<<i+1;
      for(int k=1;k<=n-1;k++){
        cout<<i;
      }
      cout<<endl;
    }
    i++;
  }
    return 0;
}