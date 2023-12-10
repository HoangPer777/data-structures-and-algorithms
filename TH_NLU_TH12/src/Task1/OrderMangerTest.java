package Task1;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

class OrderMangerTest {

	public static void main(String[] args) {
		
		Date date1 = new Date(2023 / 6 / 3);
		Date date2 = new Date(2023 / 5 / 3);
		Date date3 = new Date(2022 / 5 / 3);
		Date date4 = new Date(2021 / 5 / 3);
		Date date5 = new Date(2020 / 5 / 3);
		Product product1 = new Product("a", "DoHop", 10,date1);
		Product product2 = new Product("b", "Nuoc", 5, date2);
		Product product3 = new Product("c", "DongLanh", 20, date3);
		Product product4 = new Product("d", "DoHop", 12, date4);
		Product product5 = new Product("e", "Nuoc", 7, date5);

		OrderItem orderItem1 = new OrderItem(product1, 2);
		OrderItem orderItem2 = new OrderItem(product2, 1);
		OrderItem orderItem3 = new OrderItem(product3, 4);
		OrderItem orderItem4 = new OrderItem(product4, 1);
		OrderItem orderItem5 = new OrderItem(product5, 6);

		ArrayList<OrderItem> orders = new ArrayList<OrderItem>();
		orders.add(orderItem1);
		orders.add(orderItem2);
		orders.add(orderItem3);
		orders.add(orderItem4);
		orders.add(orderItem5);
		Order order1 = new Order("1", "Hoang", "Hung", null, orders);

		List<Order> orderManagers = new ArrayList<Order>();
		orderManagers.add(order1);
		OrderManger orderManager = new OrderManger(orderManagers);
		System.out.println(orderManager.maxProduct());

		System.out.println(orderManager.productTypesStatistics().toString());

		System.out.println(orderManager.ordersByCost().toString());
	}

}
