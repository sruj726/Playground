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
   for (int i = 0; i < rows; i++) {
      int max_col_element = mat[0][i];
   for (int j = 0; j < cols; j++) {
      if (mat[i][j] > max_col_element)
         max_col_element = mat[i][j];
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