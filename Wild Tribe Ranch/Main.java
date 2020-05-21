#include<iostream>
int main()
{
  int mw,ef;
  std::cin>>mw;
  std::cin>>ef;
  if(ef<mw)
    std::cout<<"Yes, you can enter.";
  else if(ef==mw)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
    std::cout<<"Sorry, you can't enter";
    return 0;
}