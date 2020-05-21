#include <iostream>
#include<cstring>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
}s;
int main() 
{
    cin.get(s.name,50);
    cin >> s.roll;
    cin >> s.marks;
	
  	cout<<"\n";
    cout << "Student Details" << endl;
    cout << "Name: " << s.name << endl;
    cout << "Roll: " << s.roll << endl;
    cout << "Marks: " << s.marks << endl;
    return 0;
}