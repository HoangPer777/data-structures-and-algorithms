package Task1;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {
	private String id;
	private String customer;
	private String employee;
	private Date date;
	private List<OrderItem> orders = new ArrayList<>();
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", customer=" + customer + ", employee=" + employee + ", date=" + date + ", orders="
				+ orders + "]";
	}

	public List<OrderItem> getOrders() {
		return orders;
	}

	public Order(String id, String customer, String employee, Date date, List<OrderItem> orderItem) {
		super();
		this.id = id;
		this.customer = customer;
		this.employee = employee;
		this.date = date;
		this.orders = orderItem;
	}

	public Product maxPrice() {
		int max = 0;
		Product maxProduct = null;
		for (OrderItem item : orders) {
			if (max < item.maxPrice()) {
				max = item.maxPrice();
				maxProduct = item.getItem();
			}

		}
		return maxProduct;
	}

//	public String getType() {
//		for (OrderItem orderItem : orders) {
//			return orderItem.getType();
//		}
//		return null;
//	}

	public HashMap<String, Integer> productTypesStatistics() {
		// TODO Auto-generated method stub
		HashMap<String , Integer> result = new HashMap<String, Integer>();
		for (OrderItem orderItem : orders) {
			if(!result.containsKey(orderItem.getType())) {
				result.put(orderItem.getType(), orderItem.getAmount());
			}else {
				result.put(orderItem.getType(), orderItem.getAmount() + result.get(orderItem.getType()));
			}
			
		}
		
		return result;
	}

	public int totalPrice() {
		int totalPrice = 0;
		for (OrderItem orderItem : orders) {
			totalPrice += orderItem.getPrice();
		}
		return totalPrice;
	}

	public Date getDate() {
		// TODO Auto-generated method stub
		return date;
	}

	
}
