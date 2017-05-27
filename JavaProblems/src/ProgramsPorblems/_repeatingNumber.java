package ProgramsPorblems;

public class _repeatingNumber
{
	public static void main(String[] args) {
		
	String str="aaabbccadeeca";
	//a3b2c2a1e2c1a1
	char[] schar=str.toCharArray();
	int count=0;
	char co=str.charAt(0);
	String result="";
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)==co)
		{
			count++;	
			
		}
		else
		{
			result=result+str.charAt(i-1)+Integer.toString(count);
			co=str.charAt(i);
			count=1;
					
		}
		
	}
		
	System.out.println(result);
		
	}


}
