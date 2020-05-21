#include<iostream>
int main()
{
 int past,cur,age;
  std::cin>>past>>cur;
  if(past>cur)
  {
    cur+=100;
 age=cur-past;
 std::cout<<age; 
  }  
  else
  {
    age=cur-past;
    std::cout<<age;
}
}