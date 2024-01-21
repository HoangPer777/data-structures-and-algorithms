package Stack_queues;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import javax.swing.text.html.HTMLDocument.Iterator;

public class queue {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();
		pq1.add(5);
		pq1.add(1);
		pq1.add(3);
		pq1.offer(2);
		pq1.offer(6);
		pq1.offer(4);
		System.out.println(pq1);
		pq2.addAll(pq1);
		
		Object o1 = pq1.peek();
		System.out.println("head of queue: " + o1);
		System.out.println("Size after peek "+pq1.size());
		System.out.println("all value after peek"+pq1);
		
		int i = pq2.poll();
		System.out.println("head of poll: " + i);
		System.out.println("Size after poll "+pq2.size());
		System.out.println("all value after poll "+pq2);
		

		System.out.println("head of queue: " + pq1.element());
		System.out.println("Size after poll " + pq1.size());
	}

}
