package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

import javax.lang.model.element.Element;

public class MyArrayList<E> {
	public static final int DEFAULT_CAPACITY = 10;
	private E[] elements;
	private int size;

	public MyArrayList() {
		this.elements = (E[]) new Object[DEFAULT_CAPACITY];
	}

	public MyArrayList(int capacity) {
		this.elements = (E[]) new Object[capacity];
	}

	// creates an array of double-size if the array of elements is full
	public void growSize() {
		int newCapacity = elements.length * 2;
		elements = Arrays.copyOf(elements, newCapacity);
	}

	// Returns the number of elements in this list.
	public int size() {
		return size;
	}

	// Returns whether the list is empty.
	public boolean isEmpty() {
		return size == 0;
	}

	// Returns (but does not remove) the element at index i.
	public E get(int i) throws IndexOutOfBoundsException {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("Index out of bound hehe");
		}
		return elements[i];
	}

	// Replaces the element at index i with e, and returns the replaced element. ∗/
	public E set(int i, E e) throws IndexOutOfBoundsException {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("Index out of bound");
		} else {
			E replaceElement = elements[i];
			elements[i] = e;

			return replaceElement;
		}
	}

	// It is used to append the specified element at the end of a list.
	public boolean add(E e) {
		if (size == elements.length) {
			growSize();
		}
		elements[size++] = e;
		return true;
	}

	// Inserts element e to be at index i, shifting all subsequent elements later.
	public void add(int i, E e) throws IndexOutOfBoundsException {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException();
		}
		if (size == elements.length) {
			growSize();
		}
		for (int j = size - 1; j >= i; j--) {
			elements[j + 1] = elements[j];
		}
		elements[i] = e;
		size++;
	}

	// Removes and returns the element at index i, shifting subsequent elements
	// earlier.
	public E remove(int i) throws IndexOutOfBoundsException {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("index out of bound");
		}
		E removeElement = elements[i];
// dịch chuyển các giá trị khác về phía bên trái, 
// và trừ size đi sẽ mất giá trị cuối cùng
		for (int j = i; j < elements.length - 1; j++) {
			elements[j] = elements[j + 1];
		}
		size--; // chỉ chạy một lần
		return removeElement;
	}

	/*
	 * Then implements other methods as in Java Collection Framework -
	 * ArrayList.java
	 */
	// It is used to clear all elements in the list.
	public void clear() {
		size = 0;
	}

	// It is used to return the index in this list of the
//	last occurrence of the specified element, or -1 if the
//	list does not contain this element.
	public int lastIndexOf(Object o) {
		for (int i = size - 1; i >= 0; i--) {
			if (o.equals(elements[i])) {
				return i;
			}
		}
		return -1;
	}

	// It is used to return an array containing all of the
//	elements in this list in the correct order.
	public E[] toArray() {
		return Arrays.copyOf(elements, size);
	}

	// It is used to return a shallow copy of an ArrayList.
	public MyArrayList<E> clone() {
		MyArrayList<E> clonedList = new MyArrayList<>(size);
//		arraycopy(array source, indexSource, array destination, index destination, size of arraySource)
		System.arraycopy(this.elements, 0, clonedList, 0, size);
		clonedList.size = size;
		return clonedList;
	}

	// It returns true if the list contains the specified element
	public boolean contains(E o) {
		for (int i = 0; i < size; i++) {
			if (elements[i] == null) {
				if (o == null) {
					return true;
				} else {
					// chạy xuống cuối for return false
				}
			} else if (elements[i].equals(o)) {
				return true;
			}
		}
		return false;
	}

	// It is used to return the index in this list of the
//	first occurrence of the specified element, or -1 if the
//	List does not contain this element.
	public int indexOf(E o) {
		for (int i = 0; i < size; i++) {
			if (elements[i] == null) {
				if (o == null) {
					return i;
				} else {
					return -1;
				}
			} else if (elements[i].equals(o)) {
				return i;
			}
		}
		return -1;
	}

	// It is used to remove the first occurrence of the specified element.
	public boolean remove(E e) {
		int index = indexOf(e);
		if (index != -1) {
			remove(index); // phương thức ở trên chứ ko phải cái này
			return true;
		}
		return false;
	}

	// It is used to sort the elements of the list on the basis of specified
	// comparator.
	public void sort(Comparator<Integer> c) {
		Object[] newElements = Arrays.copyOf(elements, size);
		Arrays.sort(newElements,(Comparator) c);
		System.arraycopy(newElements, 0, elements, 0, size);
		
//		Object[] newElements = Arrays.copyOf(elements, size);
//		Arrays.sort(newElements, (Comparator) c);
//
//		for (int i = 0; i < size; i++) {
//			elements[i] = (E) newElements[i];
//		}
	}

	public static void main(String[] args) {
//		test size
		MyArrayList<Integer> list = new MyArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println("size = " + list.size());

//		test get(int i)
//		System.out.println(list.get(1));
//		System.out.println(list.get(5));

//		test set(int i, E e)
		list.set(3, -1);
		System.out.println("set: ");
		for (int i = 0; i < list.size; i++) {
			System.out.print(list.get(i) + ", ");
		}

//		test add(E e)
		list.add(6);
		list.add(2);
		list.add(9);
		list.add(2);
		System.out.println();
		for (int i = 0; i < list.size; i++) {
			System.out.print(list.get(i) + ", ");
		}

//		test add(int i, E e)
		System.out.println();
		list.add(3, 7);
		for (int i = 0; i < list.size; i++) {
			System.out.print(list.get(i) + ", ");
		}

//		test remove(int i)
		list.remove(3);
		System.out.print("\nremove: ");
		for (int i = 0; i < list.size; i++) {
			System.out.print(list.get(i) + ", ");
		}

//		test lastIndexOf(Object o)
		System.out.println();
		System.out.println("lastIndexOf: " + list.lastIndexOf(3));

//		test toArray()
		System.out.println(Arrays.toString(list.toArray()));

//		test contains
		System.out.println(list.contains(3));
		System.out.println(list.contains(10));

//		test indexOf(int i)
		System.out.println(list.indexOf(3));

//		test remove(E e)
		System.out.println("remove: " + list.remove(1));
		for (int i = 0; i < list.size; i++) {
			System.out.print(list.get(i) + ", ");
		}

//		test sort
		System.out.println("\nsort: ");
//		C1
//		Comparator<Integer> c = new Comparator<Integer>() {
//	        @Override
//	        public int compare(Integer o1, Integer o2) {
////	            return o1.compareTo(o2);
//	        	return o1 - o2;
//	        }
//	    };
//	    list.sort(c);
//	    for (int i = 0; i < list.size(); i++) {
//	        System.out.print(list.get(i) + ", ");
//	    }

//		C2
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer s1, Integer s2) {
				return s1.compareTo(s2); // sắp xếp tăng dần
			}
		});
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}

	}

}
