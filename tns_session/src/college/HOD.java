package college;

public class HOD extends Teacher {
String branch;
public HOD() {
	// TODO Auto-generated constructor stub
}
public HOD(int id,String name,String sub,String branch) {
	super(id,name,sub);
	this.branch=branch;
}

public void getData() {
	super.getData();
	System.out.println("Branch :"+ this.branch);
}

public static void main(String[] args) {
	HOD hod=new HOD(9,"abc","bcd","cde");
	hod.getData();
}
}

