package assignment_35;

public class Employee {
	private static int empCount=0;
	private int empNo;
	private int salary;
	private static int totalSalary;
	
	public Employee() {
	}
	
	public Employee(int salary) {
		empCount++;
		this.empNo=empCount;
		this.salary=salary;
		this.totalSalary+=salary;
	}
	
/*	
	public int getEmpNo() {
		return empNo;
	}
*/
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	void display() {
		System.out.println();
		System.out.println("Employee No. :"+this.empNo);
		System.out.println("Employee salary :"+this.salary);
		System.out.println("Employee total salary :"+this.totalSalary);
	}
	
	
	public static void main(String[] args) {
		Employee e1=new Employee(1000);

		System.out.println("Employee :");
		e1.display();
		
		Employee e2=new Employee(1000);
		e2.setEmpNo(60);
		e2.display();
		
		Employee e3=new Employee(1000);
		e3.display();
	}
}
