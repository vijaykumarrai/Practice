package com.bst;

//Java program to print a given matrix in spiral form 
import java.io.*; 

class GFG 
{ 
	// Function print matrix in spiral form 
	static void spiralPrint(int rowSize, int columnSize, int a[][]) 
	{ 
		int i, rowIndex = 0, columnIndex = 0; 
		/* rowIndex - starting row index 
		rowSize - ending row index 
		columnIndex - starting column index 
		columnSize - ending column index 
		i - iterator 
		*/
		
		while (rowIndex < rowSize && columnIndex < columnSize) 
		{ 
			// Print the first row from the remaining rows 
			for (i = columnIndex; i < columnSize; ++i) 
			{ 
				System.out.print(a[rowIndex][i]+" "); 
			} 
			rowIndex++; 

			// Print the last column from the remaining columns 
			for (i = rowIndex; i < rowSize; ++i) 
			{ 
				System.out.print(a[i][columnSize-1]+" "); 
			} 
			columnSize--; 

			// Print the last row from the remaining rows */ 
			if ( rowIndex < rowSize) 
			{ 
				for (i = columnSize-1; i >= columnIndex; --i) 
				{ 
					System.out.print(a[rowSize-1][i]+" "); 
				} 
				rowSize--; 
			} 

			// Print the first column from the remaining columns */ 
			if (columnIndex < columnSize) 
			{ 
				for (i = rowSize-1; i >= rowIndex; --i) 
				{ 
					System.out.print(a[i][columnIndex]+" "); 
				} 
				columnIndex++;	 
			}		 
		} 
	} 
	
	// driver program 
	public static void main (String[] args) 
	{ 
		int R = 3; 
		int C = 6; 
		int a[][] = { {1, 2, 3, 4, 5, 6}, 
					{7, 8, 9, 10, 11, 12}, 
					{13, 14, 15, 16, 17, 18} 
					}; 
		spiralPrint(R,C,a); 
	} 
} 


