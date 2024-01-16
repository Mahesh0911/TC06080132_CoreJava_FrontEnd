package session_05;

public class Employee {
private int empId;
private String empName;
public Employee() {

}
public Employee(int empId,String empName) {
	super();
	this.empId=empId;
	this.empName=empName;
	
}


@Override
//equals(Object o )   - method is overridden in child class Employee

	public boolean equals(Object o2) {
	Employee e2=(Employee) o2;			//downcasting the object type
	
	if ((this.empId==e2.empId) && (this.empName.equals(e2.empName))) {
		return true;
	}else {
		return false;
	}
		
	}


	public static void main(String[] args) {
		Employee e1=new Employee(111,"Rahul");
		Employee e2=new Employee(111,"Rahul");
		
		if (e1.equals(e2)) {
			System.out.println("Objects are equal.");			
		}else {
			System.out.println("Objects are not equal.");
		}
		
		System.out.println("Hashcode of e1 = "+ e1.hashCode() );
		System.out.println("Hashcode of e2 = "+ e2.hashCode() );
		
	}

}
