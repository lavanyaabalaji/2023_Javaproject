package day06;

public class TataPunchextendsTataCarSpec extends TataCarSpec{

	public static void main(String[] args) {
		TataCarSpec tatapunch=new TataPunchextendsTataCarSpec();
		tatapunch.displayHeight();//child class override method
		tatapunch.displayModelNumber();//parent class method its static

	}
	public static void displayModelNumber()
	{
		System.out.println("Tata Punch ModelNumber is 123456");
		
	}
	
	@Override
	public void displayHeight()
	{
		System.out.println("Tata Punch Height is 4.5f");
	}
	
	@Override
	public void displayWidth()
	{
		System.out.println("Tata Punch Width is 6.5f");
	}
	
	@Override
	public void displaySpeed()
	{
		System.out.println("Tata Punch Speed is 110km/hr");
	}
	
	@Override
	public void displayPrice()
	{
		System.out.println("Tata Punch Price is 9.5L");
	}

	}

