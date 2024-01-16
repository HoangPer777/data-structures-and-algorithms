package b1_QLCB;

public class Engineer extends Employee{
	private String trainingIndustry;

	public Engineer(String name, int age, String sex, String trainingIndustry) {
		super(name, age, sex);
		this.trainingIndustry = trainingIndustry;
	}
	 
}
