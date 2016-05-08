import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Demo {

	public static void main(String[] args) {

		Employee[]emp=new Employee[3];
		emp[0]=new Employee(3, "david", 4000, "IT");
		emp[2]=new Employee(2, "tani", 5000, "Klaus");
		
		
		System.out.println("gefore sorting");
		
//		for (employee employee : emp) {
//			System.out.println(employee);
//		}
//		
//		System.out.println();
//		//Arrays.sort(emp);
//		for (employee employee : emp) {
//			System.out.println(employee);
//		}

		
		ArrayList<Employee>list=new ArrayList<>();
		list.add(new Employee(1, "daminik", 3000, "IT"));
		list.add(new Employee(3, "dvminik", 3000, "IT"));
		list.add(new Employee(2, "dominik", 3000, "IT"));
		
		//Collections.sort((List<employee>));
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}

}
