#include <iostream>
#include<iomanip>
using namespace std;

struct Employee
{
    char name[50];
    char d[10];
  	float sal;
    int empid,age;
} s;

int main()
{  
        cout << "Enter name: "<<endl;
        cin >> s.name;
        
        cout<<"Enter ID:"<<endl;
        cin>>s.empid;
        
		cout<<"Enter age: "<<endl;
      	cin>>s.age;

        cout << "Enter designation: "<<endl;
        cin >> s.d;
 
      	cout<<"Enter Salary:"<<endl;
      	cin>>s.sal;


      	cout<<"Employee Details "<<endl;
        cout << "Name of the Employee : " << s.name << endl;
        cout<<"ID of the Employee : "<<s.empid<<endl;
        cout<<"Age of the Employee : "<<s.age<<endl;
        cout << "Designation of the Employee : " << s.d << endl;
      cout << "Salary of the Employee : "<< s.sal<< endl;


    return 0;
}