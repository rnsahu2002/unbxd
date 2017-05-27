package SortingandMerging;

import java.io.File;
import java.nio.CharBuffer;

public class AlternateCharsinTwoString {
	
	public String join(String str1, String str2){
	  		 
	    int i=0;
        String result="";
		while(i<str1.length() || i<str2.length())
		{
			char c1 ;
			char c2 ;
		 if(i < str1.length())	{
		   c1 = str1.charAt(i);
		   result=result+c1;
		 }
		 if(i < str2.length()) {
		   c2 = str2.charAt(i);
		   result=result+c2;
		   // System.out.print(c2);
		 }
		  
			i++;
		}
		return result;

			
			 
     }
		 
/*
		    char first= str1.charAt(0);
		    char second= str2.charAt(0);
		    result= Character.toString(first )+ Character.toString(second);
		    if(str1.length()>1 && str2.length()>1)
		        result= result+ join(str1.substring(1),str2.substring(1));
		    else if(str1.length()==1)
		        return result+str2.substring(1);
		    else if (str2.length()==1)
		        return result+str1.substring(1);    

*/		  //  return result;


	public static void main(String[] args) throws StringIndexOutOfBoundsException {
		
		
		String s1="ghfkl";
		String s2="df";
		
		AlternateCharsinTwoString v = new AlternateCharsinTwoString();
		//String s =v.join(s1, s2);
		System.out.println(v.join(s1, s2));
		}

}
