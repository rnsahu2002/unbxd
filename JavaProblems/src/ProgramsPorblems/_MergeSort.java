package ProgramsPorblems;

import java.util.Arrays;

public class _MergeSort {
	
    private int[] helper;

	public  void MergeSort(int[] arr,int low, int high) {

		if(low<high)
		{
		int mid = (low + high) / 2;

	//	System.out.println(Arrays.toString(arr));
		
		MergeSort(arr,low,mid);
	
		MergeSort(arr,mid+1,high);
		
		merge(arr,low,high,mid);
		
		
		}
}
	
	public  void merge(int[] arr,int low ,int middle, int high) {
	
    for (int i = low; i <= high; i++) {
	            helper[i] = arr[i];
	        }

	        int i = low;
	        int j = middle + 1;
	        int k = low;
	        while (i <= middle && j <= high) {
	            if (helper[i] <= helper[j]) {
	                arr[k] = helper[i];
	                i++;
	            } else {
	                arr[k] = helper[j];
	                j++;
	            }
	            k++;
	        }
	        // Copy the rest of the left side of the array into the target array
	        while (i <= middle) {
	            arr[k] = helper[i];
	            k++;
	            i++;
	        }

	    }
	

	public static void main(String[] args) {
		int[] arr = { 1,8,2,5,33,3,12};
		_MergeSort obj = new _MergeSort();
		obj.MergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		

	}
}
