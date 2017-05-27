package ProgramsPorblems;

public class _SearchElementin2DArray {
	
	//stair search code
	public boolean SearchElemenet(int[][] arr,int n,int element)
	{
	boolean result=false;
	if(element<arr[0][0] || element>arr[n-1][n-1])	
	{
		return result;
		
	}
	int row=0;
	int col=n-1;
	while(row<=n-1 && col>=0)
	{
	 if(arr[row][col]<element)
	{		
		 row++;
		 
	}
	else if (arr[row][col] >  element)
	{
		col--;

	}
	else
	{
		result=true;
		return true;
		
	}
		
	}
	return result;
	}
	
	
public static void main(String[] args) {

	int[][] arr={{1,4,6,8},
				{3,9,10,12},
				{5,11,14,19},
				{7,13,15,20}};
	
	_SearchElementin2DArray obj =new _SearchElementin2DArray();
	System.out.println(obj.SearchElemenet(arr, 4, 7));
	}
}
	
	


