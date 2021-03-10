package quiz11;

public class Main {


	public static void main(String[] args) 
	{
		Product pd = new Radio();
		Product tv = new Tv();
		Product cm = new Computer();
		MyCart mc = new MyCart(50000);
		mc.buy(pd);
		mc.buy(tv);
		mc.buy(tv);
		mc.buy(cm);
		mc.buy(cm);
		mc.buy(pd);
	}

}
