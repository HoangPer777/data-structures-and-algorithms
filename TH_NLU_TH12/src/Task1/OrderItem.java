package Task1;

public class OrderItem {
	private Product item;
	private int amount;
	
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


	public int getAmount() {
		return amount;
	}


	public void setItem(Product item) {
		this.item = item;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public int getPrice() {
		// TODO Auto-generated method stub
		return item.getPrice();
	}
}
