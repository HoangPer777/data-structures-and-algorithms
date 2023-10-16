package Task1_4;

public class Product implements Comparable<Product> {
	private String id;
	private String name;
	private double price;
	private String type;

	public Product(String id, String name, double price, String type) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public String getId() {
		return id;
	}


	public String getType() {
		return type;
	}


	public double getPrice() {
		return price;
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		int byName = this.name.compareTo(o.name);
		if (byName == 0) {
			return Double.compare(this.price, o.price);
		}
		return byName;
	}

	@Override
	public String toString() {
		return "[" + id + ", " + name + ", price=" + price + ", type=" + type + "]";
	}

//	public static boolean contains(Product p) {
//		// TODO Auto-generated method stub
//		 int id = Integer.parseInt(p.getId());
//		if(id < 0) {
//			return false;
//		}else {
//			
//		}
//		return false;
//		
//	}



}
