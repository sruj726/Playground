#include <iostream>
int main()
{
    int i, j, s, e, sum;
    std::cin>>s;
    std::cin>>e;
    for(i=s; i<=e; i++)
    {
        sum = 0;
        for(j=1; j<i; j++)
        {
            if(i % j == 0)
            {
                sum += j;
            }
        }
         if(sum == i)
        {
            std::cout<< i <<" ";
        }
    }

    return 0;
}