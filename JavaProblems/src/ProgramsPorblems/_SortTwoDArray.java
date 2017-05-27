package ProgramsPorblems;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class _SortTwoDArray {

		static void printMatrix(int[][] grid) {
		for (int r = 0; r < grid.length; r++) {
			for (int c = 0; c < grid[0].length; c++)
				System.out.print(grid[r][c] + " ");
			System.out.println();
		}
	}
	////Use a comparator to compare two rows against each other. For example:
		
	public void SortWholeArray2dto1dto2d()
	{
    	int[][] A = { { 31, 4, 6, 8 }, { 13, 9, 10, 12 }, { 81, 11, 2, 19 },
				{ 17, 13, 5, 20 } };
    	int m=A.length;
    	int n=A[0].length;

         System.out.println("The original array:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }

        /* Saving the 2D Array into a 1D Array */

        int B[]=new int[m*n]; //creating a 1D Array of size 'r*c'
        int x = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                B[x] = A[i][j];
                x++;
            }
        }
         
        /*Sorting the 1D Array in Ascending Order*/

        int t=0;
        for(int i=0; i<(m*n)-1; i++)
        {
            for(int j=i+1; j<(m*n); j++)
            {
                if(B[i]>B[j])
                {
                    t=B[i];
                    B[i]=B[j];
                    B[j]=t;
                }
            }
        }
         
        /*Saving the sorted 1D Array back into the 2D Array */

        x = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                A[i][j] = B[x];
                x++;
            }
        }

        /* Printing the sorted 2D Array */

        System.out.println("The Sorted Array:");
		printMatrix(A);
    }
		
	
	
	public void compareTwoRowByComperator() {
		int[][] arr = { { 31, 4, 6, 8 }, { 13, 9, 10, 12 }, { 81, 11, 2, 19 },
				{ 17, 13, 5, 20 } };
		java.util.Arrays.sort(arr, new Comparator<int[]>()

		{
			@Override
			public int compare(int[] o1, int[] o2) {
				return (Integer.valueOf(o1[0]).compareTo(o2[0]));
			}

		});
		printMatrix(arr);

	}

	

	public static void main(String[] args) {
		_SortTwoDArray obj = new _SortTwoDArray();
	//	obj.compareTwoRowByComperator();
		obj.SortWholeArray2dto1dto2d();

	}
}
