package day06;

public class TataNexon extends TataCarSpec {

	public static void main(String[] args) {
		TataNexon nexon=new TataNexon();
		nexon.displayHeight();
		nexon.displayPrice();
		nexon.displaySpeed();

	}
	@Override
	public void displayHeight()
	{
		System.out.println("TataNexon Height is 5.51");
	}
	@Override
	public void displayWidth()
	{
		System.out.println("TataNexon Width is 7f");
	}
	@Override
	public void displaySpeed()
	{
		System.out.println("TataNexon Speed is 120km/hr");
	}
	@Override
	public void displayPrice()
	{
		System.out.println("TataNexon Price is 10.5L");
	}

}
