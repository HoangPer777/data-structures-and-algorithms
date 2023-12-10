package Task1;

import java.util.Date;

public class Product {
	String name;
	String type;
	int price;
	Date expiredDate;

	public Product(String name, String type,int price, Date expiredDate) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.expiredDate = expiredDate;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	public int getPrice() {
		return price;
	}
	public int maxPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	public String getType() {
		return type;
	}

}
