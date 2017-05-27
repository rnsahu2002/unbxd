package SortingandMerging;
import java.util.Arrays;
public class QuickSort3 {
		
	
	public void quickSort(int[] arr,int low, int high) {
		int i = low;
		int j = high;
		int mid = (low + high) / 2;
		int pivot = arr[mid];
//		int[] arr = { 1,8,2,5,33,3,12};
//		int[] arr = { 1,3,2,5,33,8,12};
		//low 0 high 6 piv arr[3]=5;
		//i 123
	   // j 543 
		while (i <=j) {
			System.out.println(pivot);
			while (arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j --;
			}
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		System.out.println("i:"+i+"j:"+j+"high:"+high+"low:"+low);
		System.out.println(Arrays.toString(arr));
		
	
		if(low<j)
		{
			quickSort(arr, low, j);
			
		}
		System.out.println(Arrays.toString(arr));	
		if(high>i)
		{
			quickSort(arr, i, high);
			
		}
	
	}
	
	public static void main(String[] args) {
		int[] arr = { 1,8,2,5,33,3,12};

		QuickSort3 sorter = new QuickSort3();
		sorter.quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}