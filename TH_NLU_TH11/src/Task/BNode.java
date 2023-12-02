
package Task;

public class BNode<E extends Comparable<E>> {
	
	private E data;
	private BNode<E> myLeft;
	private BNode<E> myRight;

	@Override
	public String toString() {
		return "[" + "Node=" + data + ", Left=" + myLeft + ", Right=" + myRight + "]";
	}

	public BNode(E data) {
		this.data = data;
		this.myLeft = null;
		this.myRight = null;
	}

	public E getData() {
		return data;
	}
	public void setData(E data) {
		this.data = data;
	}

	public BNode<E> getMyLeft() {
		return myLeft;
	}

	public BNode<E> getMyRight() {
		return myRight;
	}

	public BNode(E data, BNode<E> left, BNode<E> right) {
		this.data = data;
		this.myLeft = left;
		this.myRight = right;
	}

	public void setMyLeft(BNode<E> myLeft) {
		this.myLeft = myLeft;
	}

	public void setMyRight(BNode<E> myRight) {
		this.myRight = myRight;
	}

}
