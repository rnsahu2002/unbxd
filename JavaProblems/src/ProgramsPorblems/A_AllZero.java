package ProgramsPorblems;

import java.util.Arrays;

public class A_AllZero {
	
	public void method1(int[] arr)
	{
		int m=0;
		int n=arr.length-1;
		
		while(m<n)
		{
			while(arr[m]!=0)
			{
				m++;
				
			}
			while(arr[n]==0)
			{
				n--;
				
			}			
					
		if(m<n)
		{
			int temp=arr[n];
			arr[n]=arr[m];
			arr[m]=temp;
			m++;
			n--;
		}
		
				
		}
		
		System.out.println(Arrays.toString(arr));
		}
	
	public void method2(int[] nums)
	{
		int m=0;int n=1;
		while(m <nums.length && n <nums.length){	
			if(nums[m]==0 && n <nums.length && nums[n]!=0){
				int temp=nums[m];
				nums[m]=nums[n];
				nums[n]=temp;
				m++;n++;
			}else {
				n++;
			}}
		System.out.println(Arrays.toString(nums));
	}
		
	public void method3(int[] array)
	{
		int count = -1;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] != 0) {
				array[++count] = array[i];
			}

			}
		while (count < array.length - 1)

		{
			array[++count] = 0;
		}


		System.out.println(Arrays.toString(array));
	}


	public static void main(String[] args) {
		A_AllZero obj= new A_AllZero();

		int[] arr = { 0,0,0,0,-3, 1, 2, 0, 3, 9, 3, 0, 11, 0 };
		obj.method1(arr);
		obj.method2(arr);
		obj.method3(arr);


	}			
}
	
