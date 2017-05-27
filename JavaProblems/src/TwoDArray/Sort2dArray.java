package TwoDArray;
import java.util.Arrays;
public class Sort2dArray {

 public void sort2d(int[][] m) {
	 
	 for(int i=0;i<m.length;i++)
	 {
		 Arrays.sort(m[i]);
	 }
	 System.out.println("====================");
	 dispay2darray(m);

	 System.out.println("====================");
	 for(int i=0;i<m.length;i++)
	 {
		 for(int j=0;j<m.length;j++)
		 {//System.out.println("f"+m[i][j]);
			 
			 if(m[i][0]<m[j][0])
		 {
			 int[] temp=m[i];
			 m[i]=m[j];
			 m[j]=temp;
		 }
			 
			 
		 }
		 
	 }
		 
	 
	 
			 }
 /*
 public void sort2dbyCol(int[][] m) {

	 {
		 int n =m[0].length;
		 for(int k=0;k<n;k++)
		 {

		for(int i=0;i<m.length;i++) 
				{
			for(int j=0;j<m.length;j++) 
			{
				
				if(m[j][i]>m[j+1][i])
				{
					 int temp=m[j][i];
					 m[j][i]=m[j+1][i];
					 m[j+1][i]=temp;
				}
				
			}
			 
		 
		 
		 
	 
	 */
 public static void dispay2darray(int[][] arr)
 {
	 /*		for (int i = 0; i < 3; i++)
		{	for (int j = 0; j < 5; j++) {
			System.out.print(arr[i][j] + " ");
			}
			System.out.println();}
*/
	for(int[] i:arr)
	{
		for(int j:i)
		{
			System.out.print(j+" ");
		}
		System.out.println();
		
	}
	 
	 
 }
 
 public static void main(String[] args) {

	 Sort2dArray obj = new Sort2dArray();
		int[][] arr = { { 31,35,33,34,37}, 
				        { 1,96,93,94,95 },
				        { 22,16,19,24,21 } };
		
		int rows = arr.length;
		int cols = arr[1].length;  // assuming rows >= 1
		
		//System.out.println("rows : "+rows +"\n"+"col :"+cols);
		System.out.println();
		//obj.dispay2darray(arr);
		System.out.println("**********************************");
			obj.sort2d(arr);
		//obj.sort2dbyCol(arr);
		obj.dispay2darray(arr);

		
	}

}
