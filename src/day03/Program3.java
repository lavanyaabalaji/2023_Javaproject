package day03;

public class Program3 {

	public static void main(String[] args) {
		addFunction(10,20);
		Program3 x=new Program3();
		x.subFunction(30,40);
		addFunction(20,60);
		

	}

	private static void addFunction(int a, int b) 
	{
		System.out.println(a+b);
		
		
	}
	public void subFunction(int a,int b)
	{
		System.out.println(a-b);
		
	}

}
