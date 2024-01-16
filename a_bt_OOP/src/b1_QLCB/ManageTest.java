package b1_QLCB;

import java.util.ArrayList;
import java.util.List;

class ManageTest {
	public static void main(String[] args) {
	
		Worker w1 = new Worker("Nguyen", 21, "fimale", 3);
		Worker w2 = new Worker("Linh", 21, "fimale", 7);
		Worker w3 = new Worker("Khanh", 41, "fimale", 10);
		
		Engineer e1 = new Engineer("Hoang", 20, "male", "IT");
		Engineer e2 = new Engineer("Bao", 21, "male", "Data");
		Engineer e3 = new Engineer("Tuyet", 30, "fimale", "UX/UI");
		
		Staff s1 = new Staff("Thai", 24, "male", "coffe");
		Staff s2 = new Staff("Toan", 25, "male", "shop");
		Staff s3 = new Staff("Quoc", 23, "male", "food");
		
		ArrayList<Employee> le = new ArrayList<Employee>();
		Manage manage = new Manage(le);
		manage.add(w1);
		manage.add(w2);
		manage.add(w3);
		manage.add(e1);
		manage.add(e2);
		manage.add(e3);
		manage.add(s1);
		manage.add(s2);
		manage.add(s3);
		System.out.println(manage.search("Hoang"));
		System.out.println(manage.search("hoang"));
		
//		manage.display();
//		manage.sortByName();
//		manage.display();
		
	}

}
