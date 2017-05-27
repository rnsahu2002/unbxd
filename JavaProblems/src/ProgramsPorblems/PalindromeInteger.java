package ProgramsPorblems;

public class PalindromeInteger {

	int sum=0;
	public void checkPalindromebychangingIntToStr(int x) {

		String b = Integer.toString(x);
		String s = "";
		char[] c = b.toCharArray();
		for (int i = b.length() - 1; i >= 0; i--) {
			s = s + b.charAt(i);

		}
		if (s.equals(b)) {
			System.out.println("pale");

		} else {
			System.out.println("Not");
		}

	}

	// 676
	public void checkPalindrome(int n)
	{
		while(n>0)
		{
		int p=n%10;
	//	int sum=0;;
		sum=sum*10+p;
		n=n/10;
		
			
		}
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		PalindromeInteger pr = new PalindromeInteger();
		pr.checkPalindrome(656);

	}
}
