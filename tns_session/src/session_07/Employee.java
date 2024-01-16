package session_07;


public class Employee implements Cloneable {
	private int empId;
	private String empName;
	
	public Employee() {

	}
	public Employee(int empId,String empName) {
		
		this.empId=empId;
		this.empName=empName;
	
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1=new Employee(111,"Rahul");
		System.out.println("e1 employee : "+ e1);
		Employee e2=(Employee)e1.clone();
		System.out.println("e2 employee : "+ e2);
			
	}

}
