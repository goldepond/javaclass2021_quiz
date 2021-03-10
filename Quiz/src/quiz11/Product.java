package quiz11;

public class Product {
	private String name;
	private int price;
	
	Product (String _name, int _price)
	{
		this.name = _name;
		this.price = _price;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

}
