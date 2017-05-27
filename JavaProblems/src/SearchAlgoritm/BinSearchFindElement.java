package SearchAlgoritm;

public class BinSearchFindElement {

	public void findElment(int[] arr, int key) {
		int low = 0;
		int high = arr.length;
		boolean b = false;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == key) {
				System.out.println(mid);
				break;

			} else if (arr[mid] < key) {
				low = mid + 1;

			} else if (arr[mid] > key) {
				high = mid - 1;

			}
		}
		if(low>high)
		{
			System.out.println("not found");
		}
	}

	public static void main(String[] args) {

		int[] arr = { 3, 5, 8, 9, 10, 11, 56, 79, 88 };
		BinSearchFindElement obj = new BinSearchFindElement();
		obj.findElment(arr, 88);
	}

}
