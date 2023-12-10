
package Task3;

public class Author {
	private String name;
	private int birthYear;
	public Author(String name, int birthYear) {
		super();
		this.name = name;
		this.birthYear = birthYear;
	}
	
	@Override
	public String toString() {
		return  name + "-" + birthYear ;
	}

	public String getName() {
		return name;
	}
	
}	
