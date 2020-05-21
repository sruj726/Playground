#include <iostream>
using namespace std;
#define MAXROW		10
#define MAXCOL		10

int main()
{
	int matrix[MAXROW][MAXCOL];
	int i,j,r,c;
	int sum,product;
	cin>>r;
	cin>>c;
	for(i=0;i< r;i++)
	{
		for(j=0;j< c;j++)
		{
			cin>>matrix[i][j];
		}
	}
	for(i=0;i<r;i++)
	{
	    sum=0;
	    for(j=0;j<c;j++)
	    {
			sum	+=matrix[i][j];
	    }
	    cout<<sum<<"\n";		
	}

}