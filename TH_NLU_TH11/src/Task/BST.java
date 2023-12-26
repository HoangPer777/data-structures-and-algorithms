package Task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.crypto.Data;

public class BST<E extends Comparable<E>> {
	private BNode<E> root;

	public BST() {
		this.root = null;
	}

	@Override
	public String toString() {
		return "[" + root + "]";
	}

	// Add element e into BST
	public void add(E e) {
		if (root == null) {
			root = new BNode<E>(e, null, null);
		} else {
			root = addRecursive(root, e);
		}
	}

	private BNode<E> addRecursive(BNode<E> current, E e) {
		// TODO Auto-generated method stub
		if (current == null) {
			return new BNode<E>(e, null, null);
		} else if (current.getData().compareTo(e) > 0) {
			current.setMyLeft(addRecursive(current.getMyLeft(), e));
		} else if (current.getData().compareTo(e) < 0) {
			current.setMyRight(addRecursive(current.getMyRight(), e));
		} else if (current.getData().equals(e)) {
			return current;
		}
		return current;
	}

	// Add a collection of elements col into BST
	public void add(Collection<E> col) {
		for (E e : col) {
			add(e);
		}
	}

	// compute the depth of a node in BST
	public int depth(E node) {
		if (node == null) {
			return -1;
		} else {
			return depthRecursive(root, node, 0);
		}
	}

	private int depthRecursive(BNode<E> current, E node, int depth) {
//		duyệt hết cây ko thấy node
		if (current == null) {
			return -1;
		}
//		tìm đc trả về kết quả
		if (current.getData().equals(node)) {
			return depth;
		}
		int valueLeft = depthRecursive(current.getMyLeft(), node, depth + 1);
		if (valueLeft != -1) {
			return valueLeft;
		}
		return depthRecursive(current.getMyRight(), node, depth + 1);
	}

	// compute the height of BST
	public int height() {
		// TODO
		return computeHight(root);
	}

	private int computeHight(BNode<E> node) {
		if (node == null) {
			return 0;
		}
		int hightLeft = computeHight(node.getMyLeft());
		int hightRight = computeHight(node.getMyRight());

		return Math.max(hightLeft, hightRight) + 1;
	}

	// Compute total nodes in BST
	public int size() {

		return computeSize(root);
	}

	public int computeSize(BNode<E> node) {
		if (node == null) {
			return 0;
		}
		int hightLeft = computeSize(node.getMyLeft());
		int hightRight = computeSize(node.getMyRight());
		return hightLeft + hightRight + 1;
	}

	// Check whether element e is in BST
	public boolean contains(E e) {
		if (e == null) {
			return false;
		} else {
			return containsRecursive(root, e);
		}

	}

	private boolean containsRecursive(BNode<E> current, E e) {
		if (current == null) {
			return false;
		}
		if (current.getData().equals(e)) {
			return true;
		} else if (current.getData().compareTo(e) > 0) {
			return containsRecursive(current.getMyLeft(), e);
		} else if (current.getData().compareTo(e) < 0) {
			return containsRecursive(current.getMyRight(), e);
		}
		return false;
	}

	// Find the minimum element in BST
//	min is most left in left
	public E findMin() {
		if (root == null) {
			return null;
		} else {
			BNode<E> current = root;
			while (current.getMyLeft() != null) {
				current = current.getMyLeft();
			}
			return current.getData();
		}

	}

	// Find the maximum element in BST
//	max is a most right in right
	public E findMax() {
		BNode<E> node = root;
		while (node.getMyRight() != null) {
			node = node.getMyRight();
		}
		return node.getData();
	}

	// Remove element e from BST
	public boolean remove(E e) {
		if (!contains(e)) {
			return false;
		}
		root = removeRecursive(root, e);
		return true;
	}

	private BNode<E> removeRecursive(BNode<E> current, E e) {
		if (current == null) {
			return null;
		}
//		tìm node cần xóa
		if (current.getData().compareTo(e) > 0) {
			current.setMyLeft(removeRecursive(current.getMyLeft(), e));
		} else if (current.getData().compareTo(e) < 0) {
			current.setMyRight(removeRecursive(current.getMyRight(), e));
		} else {
			// Nếu nút có một nút con hoặc không có nút con
			if (current.getMyLeft() == null) {
				return current.getMyLeft();
			}
			if (current.getMyRight() == null) {
				return current.getMyRight();
			}

//			Nếu có 2 con
			BNode<E> prince = findMinInRight(current.getMyRight()); // tìm giá trị bé nhất nhánh bên phải node xóa
			current.setData(prince.getData()); // set giá trị của node cần xóa thành node tìm ra ở trên
			current.setMyRight(removeRecursive(current.getMyRight(), prince.getData())); // set nhánh bên phải là nhánh
																							// bên phải cũ nhưng đã xóa
																							// đi node prince
		}
		return current;
	}

	private BNode<E> findMinInRight(BNode<E> node) {
		BNode<E> current = node;
		while (current.getMyLeft() != null) {
			current = current.getMyLeft();
		}
		return current;
	}

	// get the descendants of a node
	// Lấy danh sách con cháu của nút đang chứa dữ liệu data
	public List<E> descendants(E data) {
		if (!contains(data)) {
			return null;
		}
		List<E> descendants = new ArrayList<E>();
		BNode<E> parents = find(data, root);
		addChild(parents, descendants);
		return descendants;
	}

	private void addChild(BNode<E> node, List<E> descendants) {
//		if (node == null) {
//			return;
//		}
		if (node.getMyLeft() != null) {
			addChild(node.getMyLeft(), descendants);
			descendants.add(node.getMyLeft().getData());
		}
		if (node.getMyRight() != null) {
			addChild(node.getMyRight(), descendants);
			descendants.add(node.getMyRight().getData());
		}

	}

	private BNode<E> find(E data, BNode<E> current) {
		if (current == null) {
			return current;
		}
		if (current.getData().equals(data)) {
			return current;
		}
		BNode<E> resultLeft = find(data, current.getMyLeft());
		while (resultLeft != null) {
			return resultLeft;
		}
		return find(data, current.getMyRight());
	}

	// get the ancestors of a node
	public List<E> ancestors(E data) {
		if (!contains(data)) {
			return null;
		} else {
			List<E> ancestors = new ArrayList<>();
			addAncestor(root, data, ancestors);
			return ancestors;
		}
	}

	private boolean addAncestor(BNode<E> current, E data, List<E> ancestors) {
		if (current == null) {
			return false;
		}
//		tìm thấy rồi
		if (current.getData().equals(data)) {
			return true;
		}
		int testcurrent = (int) current.getData();
		if (addAncestor(current.getMyLeft(), data, ancestors) || addAncestor(current.getMyRight(), data, ancestors)) {

			ancestors.add(current.getData());

			return true;
		}
		return false;
	}

	// display BST using inorder approach
//	left - Node - Right
	public void inorder() {
		inorderTraversal(root);
	}

	private void inorderTraversal(BNode<E> current) {
		// TODO Auto-generated method stub
		if (current == null) {
			return;
		} else {
			inorderTraversal(current.getMyLeft());
			System.out.print(current.getData() + " ");
			inorderTraversal(current.getMyRight());
		}
	}

	// display BST using preorder approach
//	Node - left - Right
	public void preorder() {
		preoderTraversal(root);
	}

	private void preoderTraversal(BNode<E> current) {
		if(current == null) {
			return;
		}
		System.out.print(current.getData() + " ");
		preoderTraversal(current.getMyLeft());
		preoderTraversal(current.getMyRight());
		
	}

	// display BST using postorder approach
//	Left - Right - Node
	public void postorder() {
		postorderTraversal(root);
	}

	private void postorderTraversal(BNode<E> current) {
		// TODO Auto-generated method stub
		if(current == null) {
			return;
		}
		postorderTraversal(current.getMyLeft());
		postorderTraversal(current.getMyRight());
		System.out.print(current.getData() + " ");
	}

	public static void main(String[] args) {
		BST<Integer> binarySearchTree = new BST<>();

		binarySearchTree.add(6);
		binarySearchTree.add(4);
		binarySearchTree.add(8);
		binarySearchTree.add(3);
		binarySearchTree.add(5);
		binarySearchTree.add(7);
		binarySearchTree.add(9);

		System.out.println(binarySearchTree.toString());

//		List<Integer> nums = new ArrayList<Integer>();
//		for(int i = 0; i < 12; i++) {
//			nums.add(i);
//		}
//		binarySearchTree.add(nums);
//		System.out.println(binarySearchTree.toString());

//		System.out.println("depth: " + binarySearchTree.depth(4));
//
//		System.out.println("hight: " + binarySearchTree.height());
//
		System.out.println("size: " + binarySearchTree.size());
//
//		System.out.println("contain: " + binarySearchTree.contains(11));
//		System.out.println("contain: " + binarySearchTree.contains(6));

//		System.out.println("findMin: " + binarySearchTree.findMin());
//		System.out.println("findMax: " + binarySearchTree.findMax());
//
//		System.out.println("remove: " + binarySearchTree.remove(3));
//		System.out.println(binarySearchTree.toString());

//		System.out.println(binarySearchTree.descendants(4));
//		System.out.println(binarySearchTree.descendants(6));

		System.out.println(binarySearchTree.ancestors(5));
		System.out.println(binarySearchTree.ancestors(99));

//		binarySearchTree.inorder();
//		binarySearchTree.preorder();
		binarySearchTree.postorder();
	}

}