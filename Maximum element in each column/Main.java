#include<iostream>
using namespace std;
void largestInEachCol(int mat[100][100], int rows, int cols) 
{
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            cin>>mat[i][j];
        }
    }
   for (int i = 0; i < cols; i++) {
      int max_col_element = mat[0][i];
   for (int j = 1; j < rows; j++) {
      if (mat[j][i] > max_col_element)
         max_col_element = mat[j][i];
   }
   cout << max_col_element << endl;
   }
}
int main() {
int mat[100][100];
int row,col;
cin>>row;
cin>>col;
   largestInEachCol(mat, row, col);
}