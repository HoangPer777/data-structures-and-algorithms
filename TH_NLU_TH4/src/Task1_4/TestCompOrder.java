package Task1_4;

import java.util.Arrays;

public class TestCompOrder {
	public static void main(String[] args) {
		Product p1 = new Product("001", "coffee", 10, "Drink");
		Product p2 = new Product("005", "juice Orange", 8.0, "Drink");
		Product p3 = new Product("003", "chips", 5, "Snacks");
		Product p4 = new Product("004", "Salar", 20, "food");
		Product p5 = new Product("002", "Graham cookie", 15, "cookie");

		OrderItem odI1 = new OrderItem(p1, 5);
		OrderItem odI2 = new OrderItem(p2, 2);
		OrderItem odI3 = new OrderItem(p3, 1);
		OrderItem odI4 = new OrderItem(p4, 3);
		OrderItem odI5 = new OrderItem(p5, 2);

		OrderItem[] odIs = { odI1, odI2, odI3, odI4, odI5 };
		Arrays.sort(odIs);
		
		
//		Arrays.sort(odIs, new Comparator<OrderItem>() {
//			@Override
//			public int compare(OrderItem o1, OrderItem o2) {
//				// TODO Auto-generated method stub
//				return o1.compareTo(o2);
//			}
//			
//		});
		
		System.out.println(Arrays.toString(odIs));
		
		
		Order order = new Order(odIs);
//		 order.setItems(odIs);
//		items[1] = odI1;
//        order.addOrderItem(odI1);
//        order.addOrderItem(odI2);
//        order.addOrderItem(odI3);
//        order.addOrderItem(odI4);
//        order.addOrderItem(odI5);

//        System.out.println(Arrays.toString(odIs));
        System.out.println("Total cost: " + order.cost());
        System.out.println("Contains chips: " + order.contains(p3));
        System.out.println("Contains pizza: " + order.contains(new Product("006", "Pizza", 12.0, "Food")));
        Product[] drinks = order.filter("Drink");
        System.out.println("Drink products: " + Arrays.toString(drinks));

	}
}
