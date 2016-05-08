import java.util.Comparator;

public class employeeComperator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		int i=o1.getName().compareTo(o2.getName());
		if(i!=0)
		{
			return i;
		}
		return 0;
	}
}
