package b1_QLCB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Manage {
	private ArrayList<Employee> listEmployee = new ArrayList<Employee>();

	public Manage(ArrayList<Employee> listEmployee) {
		super();
		this.listEmployee = listEmployee;
	}

	public void add(Employee employee) {
		listEmployee.add(employee);
	}
	
//	public List<Employee> search(String name) {
//		List<Employee> result = new ArrayList<Employee>();
//		for(Employee employee: listEmployee) {
//			if(employee.getName().equals(name)) {
//				result.add(employee);
//			}
//		}
//		return result;
//	}
	public List<Employee> search(String name) {
        return listEmployee.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }
	
	
	public void display() {
		for(Employee employee: listEmployee) {
			System.out.println(employee);
		}
	}
	
	public void sortByName() {
		listEmployee.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
	}
	
}
