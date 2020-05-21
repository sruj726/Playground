    #include<iostream>
    int main()
{
int nf,df,sf,da,sa,na,ns,ds,ss,flip,ama,snap;
  std::cin>>nf;
  std::cin>>df;
  std::cin>>sf;
  std::cin>>ns;
  std::cin>>ds;
  std::cin>>ss;
  std::cin>>na;
  std::cin>>da;
  std::cin>>sa;

  flip=nf-((nf*df/100))+sf;
  ama=na-(na*da/100)+sa;
  snap=ns-(ns*ds/100)+ss;
  std::cout<<"In Flipkart"<<" Rs."<<flip<<"\n";
     std::cout<<"In Snapdeal"<<" Rs."<<snap<<"\n";
     std::cout<<"In Amazon"<<" Rs."<<ama<<"\n";
  if(flip<=ama&&flip<=snap)
    std::cout<<"He will prefer Flipkart";
  else if(snap<ama)
    std::cout<<"He will prefer Snapdeal";
  else
    std::cout<<"He will prefer Amazon";
}
  
  