#include <iostream>
using namespace std;

int main()
{
    int a[100];
    int n,i,oddSum=0,evenSum=0;
    std::cin>>n;
    for(i=0;i<n;i++)
    {
        cin>>a[i];
    }

    for(i=0; i<n; i++){
        if(a[i]%2==0){
        evenSum=evenSum+a[i];
        }
    else{
             oddSum=oddSum+a[i];
        }
    }
  	cout<<"The sum of the even numbers in the array is "<<evenSum;
    cout<<"\nThe sum of the odd numbers in the array is "<<oddSum;
    
    return 0;
}