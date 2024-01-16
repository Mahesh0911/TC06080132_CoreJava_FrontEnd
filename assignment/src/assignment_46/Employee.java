package assignment_46;
import java.util.Objects;

class Employee {
	private int empid;
	private String name;
	private double salary;

	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public boolean equals(Object obj1) {
		Employee obj=(Employee) obj1;	
		if ((this.empid==obj.empid) && (this.name.equals(obj.name))) {
			return true;
		}
		if (obj1 == null || getClass() != obj1.getClass())
			return false;
		Employee employee = (Employee) obj;
		return empid == employee.empid;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empid);
	}
}