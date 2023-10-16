package Task1_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Order {
	private OrderItem[] items;

	public Order(OrderItem[] items) {
		super();
		this.items = items;
	}

	public double cost() {
		double totalCost = 0.0;
		for (OrderItem item : items) {
			totalCost += item.getP().getPrice() * item.getQuality();
		}
		return totalCost;
	}

	// using binary search approach
	public boolean contains(Product p) {
//		Arrays.sort(items, new Comparator<OrderItem>() {
//			@Override
//			public int compare(OrderItem item1, OrderItem item2) {
//				String id1 = item1.getP().getId();
//				String id2 = item2.getP().getId();
//				return id1.compareTo(id2);
//			}
//		});

		// Tạo một OrderItem giả với sản phẩm cần tìm kiếm
		OrderItem searchItem = new OrderItem(p, 0);

		int index = Arrays.binarySearch(items, searchItem, new Comparator<OrderItem>() {
			@Override
			public int compare(OrderItem item1, OrderItem item2) {
				return item1.getP().getId().compareTo(item2.getP().getId());
			}
		});

		return index >= 0 ? true : false;

	}

//	using linear search
//	public boolean contains(Product p) {
//		for (OrderItem item : items) {
//            if (item.getP().getId().equals(p.getId())) {
//                return true;
//            }
//        }
//        return false;
//	}

	// get all products based on the given type using linear search
	// using list, ko phải đếm kích thước
	public Product[] filter(String type) {
		List<Product> filteredProducts = new ArrayList<>();

		for (OrderItem item : items) {
			if (item.getP().getType().equalsIgnoreCase(type)) {
				filteredProducts.add(item.getP());
			}
		}

		return filteredProducts.toArray(new Product[0]);
	}

}
