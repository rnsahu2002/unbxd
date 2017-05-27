package ProgramsPorblems;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrivateMethodAccess 
{
	  public static void main(String[] args) throws Exception 
	  {
		   Test d = new Test();
		  
		  
		        Method m = Test.class.getDeclaredMethod("foo");
		        Field f = Test.class.getDeclaredField("f1");
		        //m.invoke(d);// throws java.lang.IllegalAccessException
		        f.setAccessible(true);
		        m.setAccessible(true);// Abracadabra 
		        m.invoke(d);// now its OK
		      
		        
		        System.out.println(f.getInt(d));
		        
		    }


	    }
	
	
	class Test{
		private int f1=5;
		private int f2=5;
		
		private void foo(){
	        System.out.println("hello foo()");
		}
  	}

