package ProgramsPorblems;

public class SpiralOrderTravese {
	public void spiralprint(int m, int n, int[][] arr) {
		int k = 0, l = 0;
		int i;
		while (k < m && l < n) {

			for (i = l; i < n; i++) {
				System.out.print(arr[k][i] + ";");

			}
			k++;

			for (i = k; i < m; i++) {
				System.out.print(arr[i][n - 1] + ";");

			}
			n--;

			if (k < m) {
				// System.out.println(l+"t");
				for (i = n - 1; i >= l; i--) {
					System.out.print(arr[m - 1][i] + ";");

				}
				m--;
			}
			if (l < n) {
				for (i = m - 1; i >= k; i--) {
					System.out.print(arr[i][l] + ";");

				}
				// n--;
				l++;
			}
		}
	}

	// print diagonal
	public void digonal(int[][] arr, int m, int n) {
		for (int i = 0; i < m; i++) {
			int j = i;
			System.out.println(arr[i][j]);

		}

	}

	
	
	public void spiral1(int m,int n, int[][] arr1)
	{
		int r=0;
		int c =0;
		//int i;
		
		while(r<m && c<n)
		{
			
			for(int i=c;i<n;i++)
			{
				System.out.print(arr1[r][i]+",");
								
			}
			r++;
			for(int i=r;i<m;i++)
			{
				System.out.print(arr1[i][n-1]+",");
								
			}
			n--;
			
			if(r<m)
			{
				for(int i=n-1;i>=c;i--)
				{
					System.out.print(arr1[m-1][i]+",");
					
				}

			}
			
			m--;

			if(c<n)
			{
				for(int i=m-1;i>=r;i--)
				{
					System.out.print(arr1[i][c]+",");
					
				}
			}
			c++;	
		}	
	}
	public static void main(String[] args) {
		
		int[][] arr={{1,4,6,8},
				{3,9,10,12},
				{5,11,14,19},
				{7,13,15,20}};
	
		int[][] p = { { 2, 3, 4, 5, 6 }, { 3, 4, 8, 6, 9 }, { 3, 4, 5, 8, 4 },
				{ 1, 4, 3, 2, 8 }, { 9, 7, 5, 2, 1 } };

		
		SpiralOrderTravese sd = new SpiralOrderTravese();
		sd.spiral1(4, 4, arr);
		//sd.digonal(p, 5, 5);

	}

}
