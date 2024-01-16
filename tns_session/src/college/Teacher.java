package college;

public class Teacher extends Person {
	String subject;
public Teacher() {
	// TODO Auto-generated constructor stub
}
public Teacher(int id,String name,String sub) {
super(id,name);
this.subject=sub;
}
public void getData() {
	super.getData();
	System.out.println("Subject :"+ this.subject);
}
}
