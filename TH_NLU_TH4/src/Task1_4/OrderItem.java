package Task1_4;

public class OrderItem implements Comparable<OrderItem> {
//public class OrderItem{
	private Product p;
	private int quality;

	public OrderItem(Product p, int quality) {
		super();
		this.p = p;
		this.quality = quality;
	}

	public Product getP() {
		return p;
	}

	public int getQuality() {
		return quality;
	}

	@Override
	public String toString() {
		return p + ", quality=" + quality + "]";
	}

	public int compareTo(OrderItem o) {
		// TODO Auto-generated method stub
		return this.p.getId().compareTo(o.p.getId());

	}
//	anonymous
//	public static void sortByID(Product[] products) {
//        Arrays.sort(products, new Comparator<Product>() {
//            @Override
//            public int compare(Product p1, Product p2) {
//                return p1.getId().compareTo(p2.getId());
//            }
//        });
//    }

}
