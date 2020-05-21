#include <iostream>
using namespace std;

struct Distance{
    int feet,feet1,feet2;
    float inch,inch1,inch2;
}d1 , d2, sum;

int main()
{

    cin >> d1.feet1;
    cin >> d1.inch1;
    cin >> d2.feet2;
    cin >> d2.inch2;

    sum.feet = d1.feet1+d2.feet2;
    sum.inch = d1.inch1+d2.inch2;
    if(sum.inch > 12)
    {
        ++ sum.feet;
        sum.inch -= 12;
    } 

    cout << sum.feet << "\'-" << sum.inch <<"\""<<endl;
    return 0;
}