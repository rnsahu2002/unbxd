package ProgramsPorblems;
import java.util.HashSet;
import java.util.Set;
public class A_AllAnagrams {
	
	
	public static Set<String> generatePerm(String input)
	{
	    Set<String> set = new HashSet<String>();
	  /*  if (input == "")
	        return set;

*/	    Character a = input.charAt(0);

	    if (input.length() > 1)
	    {
	        input = input.substring(1);
	        //System.out.println("Tes"+input);

	        Set<String> permSet = generatePerm(input);

	        for (String x : permSet)
	        {
	            for (int i = 0; i <= x.length(); i++)
	            {
	            	System.out.println(x.substring(0, i) + a + x.substring(i));
	                set.add(x.substring(0, i) + a + x.substring(i));
	            }
	        }
	    }
	    else
	    {
	        set.add(a + "");
	    }
	    return set;
	}

	
    public static void main(String args[])throws Exception
    {
    	A_AllAnagrams ob=new A_AllAnagrams();
    	//System.out.println("tets:"+k.substring(0,0));
        System.out.println(ob.generatePerm("ABC"));
        
    }
}

