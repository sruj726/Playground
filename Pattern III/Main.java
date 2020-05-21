#include<iostream>
using namespace std;
int main(){
  int n,i=1,c=0,k,j;
  cin>>n;
  while(i<=n){
        for(j=1;j<=i-1;j++){
                cout<<i<<"*";
        }
        cout<<i<<endl;
        i++;
  }
  i--;
  while(i>=1){
        for(k=i;k>=2;k--){
                cout<<i<<"*";
        }
        cout<<i<<endl;
        i--;
  }

  }
