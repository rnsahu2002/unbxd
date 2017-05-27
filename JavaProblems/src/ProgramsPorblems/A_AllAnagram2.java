package ProgramsPorblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class A_AllAnagram2 {

	/*
	 * public static char[] charArray;
	 * 
	 * public A_AllAnagram2(String word) { charArray = word.toCharArray();
	 * doAnagram(charArray.length); }
	 * 
	 * public void changeOrder(int newsize) { int j; int pointAt =
	 * charArray.length - newsize; char temp = charArray[pointAt];
	 * 
	 * for (j = pointAt + 1; j < charArray.length; j++) { charArray[j - 1] =
	 * charArray[j]; }
	 * 
	 * charArray[j - 1] = temp;
	 * 
	 * }
	 * 
	 * public void doAnagram(int newsize) { if (newsize == 1) { return; } for
	 * (int i = 0; i < newsize; i++) { doAnagram(newsize - 1); if (newsize == 2)
	 * { display(); } changeOrder(newsize); } }
	 * 
	 * public void display() { for (int i = 0; i < charArray.length; i++) {
	 * System.out.print(charArray[i]); } System.out.println(); }
	 * 
	 * public static void main(String args[]) {
	 * 
	 * A_AllAnagram2 test1 = new A_AllAnagram2("Love");
	 * 
	 * 
	 * 
	 * }
	 */
	/*
	 * String str = "ABC"; public void printpemu(char[] inputs, int currfocus) {
	 * if (currfocus == inputs.length - 1) { System.out.println(inputs); return;
	 * } printpemu(inputs, currfocus + 1); for (int i = currfocus + 1; i <
	 * inputs.length; i++) { char temp = inputs[currfocus]; inputs[currfocus] =
	 * inputs[i]; inputs[i] = temp; printpemu(inputs, currfocus + 1); } } public
	 * static void main(String[] args) { String str = "SAHU"; int currentfocus =
	 * 0; A_AllAnagram2 am = new A_AllAnagram2();
	 * am.printpemu(str.toCharArray(), currentfocus); }
	 */
/*
	public static void main(String[] args) {

		String word = "java";
		if (word.length() < 1) {
			return;
		}

		// String word=args[0];
		ArrayList<Integer> indices = new ArrayList<Integer>();
		ArrayList<String> permutations = A_AllAnagram2.getPermu(word, indices);

		System.out.println(permutations.size());
		Set<String> st = new HashSet<String>(permutations);
		System.out.println(st.size());
		for (String str1 : st) {
			System.out.println(str1);

		}
		return;

	}

	public static ArrayList<String> getPermu(String word,
			ArrayList<Integer> indices) {
		int length = word.length();
		ArrayList<String> toreturn = new ArrayList<String>();
		if (indices.size() == length) {
			toreturn.add("");
			return toreturn;
		}

		for (int i = 0; i < length; i++)

		{
			if (indices.contains(i)) {

				continue;
			}

			ArrayList<Integer> newindices = new ArrayList<Integer>();

			for (int index : indices) {
				newindices.add(index);
			}

			newindices.add(i);
			ArrayList<String> permutation = A_AllAnagram2.getPermu(word,
					newindices);
			for (String str : permutation) {

				toreturn.add(word.charAt(i) + str);
			}

		}
		return toreturn;
	}

*/
	/*
    public  static void perm1(String s) 
    { 
    	perm1("", s);
    }
    private static void perm1(String prefix, String s) {
        int n = s.length();
        if (n == 0)
        {
System.out.println("PRE:"+prefix);
        }
        	else {
            for (int i = 0; i < n; i++)
            {
               perm1(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, n));
            }
        }

    }

    public static void perm2(String s) {
        int n = s.length();
        char[] a = new char[n];
        for (int i = 0; i < n; i++)
            a[i] = s.charAt(i);
        perm2(a, n);
    }

    private static void perm2(char[] a, int n) {
        if (n == 1) {
          //  System.out.println(a);
            return;
        }
        for (int i = 0; i < n; i++) {
            swap(a, i, n-1);
            perm2(a, n-1);
            swap(a, i, n-1);
        }
    }  
    private static void swap(char[] a, int i, int j) {
        char c = a[i];
        a[i] = a[j];
        a[j] = c;
    }
   
    public static void main(String[] args) {
      //  int n = Integer.parseInt(args[0]);
        String alphabet = "abcdefg";
        int n =alphabet.length();
        perm1(alphabet);
        System.out.println();
        perm2(alphabet);
    }
    */

	 public static Set<String> permutationFinder(String str) {
	        Set<String> perm = new HashSet<String>();
	        //Handling error scenarios
	        if (str == null)
	        {
	            return null;
	        } else if (str.length() == 0) {
	            perm.add("");
	            return perm;
	        }
	        char initial = str.charAt(0); // first character
	        String rem = str.substring(1); // Full string without first character
	        Set<String> words = permutationFinder(rem);
	        for (String strNew : words) {
	            for (int i = 0;i<=strNew.length();i++){
	                perm.add(charInsert(strNew, initial, i));
	                
	            }
	        }
	        return perm;
	    }

	    public static String charInsert(String str, char c, int j) {
	        String begin = str.substring(0, j);
	        String end = str.substring(j);
	        return begin + c + end;
	    }

	    public static void main(String[] args) {
	        String s = "ABC";
	        System.out.println("\nPermutations for " + s + " are: \n" + permutationFinder(s));
	    }
	}





	
	

	

