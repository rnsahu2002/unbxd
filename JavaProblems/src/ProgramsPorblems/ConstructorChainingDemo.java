package ProgramsPorblems;

public class ConstructorChainingDemo {
	   //default constructor of the class
	   public ConstructorChainingDemo(){
	         System.out.println("Default constructor");
	   }
	   public ConstructorChainingDemo(String str){
	    	 this();


	    	 System.out.println("Parametrized constructor with single param");
	   }
	   public ConstructorChainingDemo(String str, int num){
	         //It will call the constructor with String argument
	    	 this("Hello"); 
	    	 System.out.println("Parametrized constructor with double args");
	   }
	   public ConstructorChainingDemo(int num1, int num2, int num3){
	   	// It will call the constructor with (String, integer) arguments
	        this("Hello", 2);
	        System.out.println("Parametrized constructor with three args");
	   }
	   public static void main(String args[]){
	        //Creating an object using Constructor with 3 int arguments
		   ConstructorChainingDemo obj = new ConstructorChainingDemo(5,5,15);
	   }
	}

