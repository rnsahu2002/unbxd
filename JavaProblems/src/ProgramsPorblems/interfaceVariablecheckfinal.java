package ProgramsPorblems;

public class interfaceVariablecheckfinal  implements in1 {
	
	
	public void m1()
	{
		System.out.println("final");
	}
	
	public static final void main(String[] args) {
		interfaceVariablecheckfinal c1 = new interfaceVariablecheckfinal();
		//interfaceVariablecheckfinal c2 = new interfaceVariablecheckfinal();
		c1.m1();
		System.out.println("Ghu");
		
		//c1.s=10;
		System.out.println(in1.s);
	//	c2.s=10;
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
}
 interface  in1 extends in2,in3
{
	public  abstract  void  m1();
	int s=3;
	
}
 interface  in2
{
	public  abstract  void  m3();
	int s=3;
	
} interface  in3
{
	public  abstract  void  m2();
	int s=3;
	
}

