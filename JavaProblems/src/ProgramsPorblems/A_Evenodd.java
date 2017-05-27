package ProgramsPorblems;

import java.util.Arrays;

public class A_Evenodd {
	public static void main(String[] args) {
		
		int[] arr={7,9,3,1,9,3,7,1,1,1,1,1,1,11,1,1,1,1,1,1,1,1,1,2};
		
		int low=0;
		int high=arr.length-1;
		
		
		while(low <= high) {
			//increment till we find 1
			while(arr[low]%2 != 0)
				low ++;
			
			//decrement till we find 0
			while(arr[high]%2 == 0)
				high--;
			if(low<high)
			{
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low ++;
				high--;
		}
		}
System.out.println(Arrays.toString(arr));
	}
}