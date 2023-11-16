package Task1_1;

public class Student {
	private String id;
	private String name;
	private int year;
	
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return  name + "-" + year ;
	}

	public Student(String id, String name, int year) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
	}
	
}
