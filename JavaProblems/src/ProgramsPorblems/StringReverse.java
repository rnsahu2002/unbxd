package ProgramsPorblems;

public class StringReverse {

	public static void main(String[] args) {

		String str="cvhg";
		char[] ch =str.toCharArray();
		
		for(int i=0;i<ch.length/2;i++)
		{
		char	temp=ch[i];
		ch[i]=ch[ch.length-1-i];
		ch[ch.length-1-i]=temp;
			
				
		}
		
		System.out.println(ch);
		
		/* String s="stringA";
	        for(int i=s.length()-1;i>=0;i--){
	            s+=s.charAt(i);
	            System.out.println(s);
	        }
	        s=s.substring(s.length()/2, s.length());
	        System.out.println(s);
	  */  }
	}


