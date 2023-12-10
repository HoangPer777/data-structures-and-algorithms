package Task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class OrderManger {
	List<Order> orders = new ArrayList<>();

	public OrderManger(List<Order> orders) {
		super();
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "OrderManger [orders=" + orders + "]";
	}

	public Product maxProduct() {
		for (Order order : orders) {
			return order.maxPrice();
		}
		return null;
	}

	public Product maxProduct2() {
		Comparator<Product> comp = Comparator.comparing(Product::getPrice);
 		return this.orders.stream().flatMap(x -> x.getOrders().stream()).map(x -> x.getItem()).max(comp).get();
	}

//	trả về loại sản phẩm và số lượng bán ra cho mỗi loại
	public HashMap<String, Integer> productTypesStatistics() {
//		HashMap<String ,Integer> result = new HashMap<String, Integer>();
		for (Order order : orders) {
			return order.productTypesStatistics();
		}
		return null;
	}

//	trả về danh sách các hóa đơn sắp xếp giảm dần theo giá trị của hóa đơn.
//	Nếu 2 hóa đơn có cùng giá trị thì xếp theo ngày.
	public TreeSet<Order> ordersByCost() {
		Comparator<Order> byCost = new Comparator<Order>() {
			public int compare(Order o1, Order o2) {
				if (o1.totalPrice() == o2.totalPrice()) {
					return o1.totalPrice() - o2.totalPrice();
				} else {
					return o1.date.compareTo(o2.date);
				}

			}
		};
		TreeSet<Order> result = new TreeSet<Order>(byCost);
		for (Order order : orders) {
			result.add(order);
		}
		return result;

	}
}
