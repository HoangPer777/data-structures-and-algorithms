package b1_QLCB;

public abstract class Employee {
	private String name;
	private int age;
	private String sex;
	public Employee(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}

	public String getName() {
		return name;
	}

}
