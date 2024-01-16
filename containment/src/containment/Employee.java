package containment;

public class Employee {
	private String name;
	private Date date;
	
	public Employee(String name,Date dt) {
		this.name=name;
		this.date=dt;
	}
	
	@Override
	public String toString() {
		
		return name+date;
	}
	public static void main(String[] args) {
		Employee emp=new Employee("abc",new Date(18,10,2023));
		
		System.out.println(emp);
	}

}
