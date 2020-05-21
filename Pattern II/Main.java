#include<iostream>
using namespace std;
int main(){
  int n,i=1,c=0,k,j;
  cin>>n;
        while(i<=n){
                if(i%2!=0){
                        int a=c+1;
                        int b=c+i;
                for( j=a;j<b;j++){
                        c+=1;
                    cout<<j<<"*";


                }
                c+=1;
                cout<<c<<endl;


        }
        else{
                    int p=c+i;
                    int q =c;
            for (k=p;k>q+1;k--){
                    c+=1;
                cout<<k<<"*";

            }
            c+=1;
        cout<<k<<endl;

        }
        i+=1;
  }
}