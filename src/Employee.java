import java.util.Comparator;

public class Employee implements Comparator<Employee>{
	
	private int empNumber;
	private String name;
	private double salary;
	private String department;
	
	public Employee(int empNumber, String name, double salary, String department) {
		super();
		this.empNumber = empNumber;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getEmpNumber() {
		return empNumber;
	}

	@Override
	public String toString() {
		return "employee [empNumber=" + empNumber + ", name=" + name + ", salary=" + salary + ", department="
				+ department + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empNumber != other.empNumber)
			return false;
		return true;
	}

	/*@Override
	public int compareTo(employee o) {
		if (this.name.equals(o.name))
		{
			return -1;
		}
		if (!this.name.equals(o.name))
		{
			return 1;
		}
		return 0;
		
	}*/

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
