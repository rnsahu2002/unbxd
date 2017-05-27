package ProgramsPorblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class A_MinMaxAlternativeWithNewArray {
	
	
	public static void main(String[] args) 
	{

		int[] arr = {13,1,11,2,3,9,4,10,5,6,7,8,12,1,1,1};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;					
				}		
			}

		}

		System.out.println(Arrays.toString(arr));
		int[] arr1 = new int[arr.length];

		int l = arr.length-1;
		//newArray[0]=arr[0];
		int evenCount = 0;
		int oddCount = 1;

		for (int i=0;i<l;i++)
		
		{
			if(i%2==0)
			{
				arr1[i]=arr[i-evenCount];
				evenCount++;
			
			}
			else
			{

				arr1[i]=arr[l-i+oddCount];
				oddCount++;
				
			}
			}
				
		System.out.println(Arrays.toString(arr1));
	}
}
	

