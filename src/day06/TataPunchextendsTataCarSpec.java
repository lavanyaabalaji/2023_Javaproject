package day06;

public class TataPunchextendsTataCarSpec {

	public static void main(String[] args) {
		TataCarSpec tatapunch=new TataPunch();
		tatapunch.displayHeight();//child class override method
		tatapunch.displayModelNumber();//parent class method its static

	}
	public static void displayModelNumber()
	{
		System.out.println("TataPunchModelNumber is 123456");
		
	}
	@Override
	public void displayHeight()
	{
		System.out.println("TataPunch Height is 4.5f");
	}
	@Override
	public void displayWidth()
	{
		System.out.println("TataPunch Width is 6.5f");
	}
	@Override
	public void displaySpeed()
	{
		System.out.println("TataPunch Speed is 110km/hr");
	}
	@Override
	public void displayPrice()
	{
		System.out.println("TataPinch Price is 9.5L");
	}

	

}
