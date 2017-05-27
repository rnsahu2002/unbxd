package ProgramsPorblems;

import java.util.*;

public class _largestArrayIn {

public static Comparator<Integer> cmp1 = new Comparator<Integer>() {
	
	@Override
	public int compare(Integer o1, Integer o2) {
	
	String o1s=o1.toString();
	String o2s=o2.toString();
	if(o1s.length()==o2s.length())
	{
		return o1s.compareTo(o2s);
		
	}
	else
	{
	
	int maxlen=Math.max(o1s.length(), o2s.length());
	
	while(o1s.length()<maxlen)
	{
		o1s+=o1s;
	}
	
	while(o2s.length()<maxlen)
	{
		o2s+=o2s;
	}
	
	return o2s.compareTo(o1s);
	
	}
	
	}
};
	
	private static Comparator<Integer> sorter = new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			String o1s = o1.toString();
			String o2s = o2.toString();

			if (o1s.length() == o2s.length()) {
				return o2s.compareTo(o1s);
			}

			int mlen = Math.max(o1s.length(), o2s.length());
			while (o1s.length() < mlen)
				o1s += o1s;
			while (o2s.length() < mlen)
				o2s += o2s;

			return o2s.compareTo(o1s);
		}
	};



	public static void main(String[] args) {
		
		List<Integer> ints2 = new ArrayList<Integer>(Arrays.asList( 654, 8,65));
		Collections.sort(ints2, cmp1);
		System.out.println(ints2);
		
		for(Integer i:ints2)
		{
			System.out.print(i);
			
		}
		
	}



/*

	 public static void main(String[] args) {
	        int arr[] = {654, 8, 65};
	        String result ="";
	        Arrays.sort(arr); //Collections.sort() for List,Vector
	        String a=Arrays.toString(arr); //toString the List or Vector
	        String arr1[]=a.substring(1,a.length()-1).split(", ");

	        System.out.println(Arrays.toString(arr1));
	         String s="8";
	       String s1="654";
	       System.out.println(s.compareTo(s1));

	        //System.out.println(Arrays.toString(arr2));
	      
	for (int i=0;i<arr1.length;i++)
	{
		for (int j=i+1;j<arr1.length;j++)
		{
		if(arr1[i].compareTo(arr1[j])<0)
			{
			String tempStr = arr1[i];
			 arr1[i] = arr1[i+1];
			 arr1[i+1] = tempStr;
				
			}

		}

	           
	 }

	System.out.println(Arrays.toString(arr1));

		
		 }		        
	        
	 }
*/



}