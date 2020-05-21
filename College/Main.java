#include <iostream>
using namespace std;

struct College
{
  	int n;
    char name[100];
    char city[100];
  	int year;
    float pass;
}c[10];

int main()
{  		
  int n;
    cout << "Enter the number of colleges" << endl;
	cin>>n;
    
    for(int i = 0; i < n; i++)
    {   
        c[i].n = i+1;
        cout << "Enter the details of college "<< c[i].n<<endl;
        cout << "Enter name"<<endl;
        cin >> c[i].name;

        cout << "Enter city"<<endl;
        cin >> c[i].city;
        
		cout<<"Enter year of establishment"<<endl;
      	cin>>c[i].year;
      	
      	cout<<"Enter pass percentage"<<endl;
      	cin>>c[i].pass;
    }
cout<<"Details of colleges"<<endl;
    for(int i = 0; i < n; ++i)
    {	
      	
        cout << "College:" << i+1 << endl;
        cout << "Name:" << c[i].name << endl;
        cout << "City:" << c[i].city<<endl;
      cout << "Year of establishment:" << c[i].year << endl;
      cout << "Pass percentage:" << c[i].pass << endl;
    }

    return 0;
}