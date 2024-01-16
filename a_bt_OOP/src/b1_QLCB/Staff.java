package b1_QLCB;

public class Staff extends Employee{
	private String job;

	public Staff(String name, int age, String sex, String job) {
		super(name, age, sex);
		this.job = job;
	}
	
}
