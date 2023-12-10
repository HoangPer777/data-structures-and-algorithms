package Task1;

public class OrderItem {
	Product item;
	int amount;
	
	public OrderItem(Product item, int amount) {
		super();
		this.item = item;
		this.amount = amount;
	}


	public Product getItem() {
		return item;
	}


	@Override	
	public String toString() {
		return "OrderItem [item=" + item + ", amount=" + amount + "]";
	}


	public int maxPrice() {
		// TODO Auto-generated method stub
		return item.maxPrice();
	}


	public String getType() {
		return item.getType();
	}


	public int getPrice() {
		// TODO Auto-generated method stub
		return item.price;
	}
}
