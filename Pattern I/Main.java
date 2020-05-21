#include<iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
        for(int j=1;j<=4;j++){
            for(int k=1;k<=j;k++){
            cout<<n;
            }
            n+=1;
            cout<<endl;
        }
        for(int m=1;m<=4;m++)
        {
            for(int l=1;l<=4-m+1;l++)
                {
                    cout<<n-1;

                }
            n--;
            cout<<endl;


        }

  }