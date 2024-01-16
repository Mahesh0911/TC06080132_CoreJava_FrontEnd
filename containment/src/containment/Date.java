package containment;

public class Date {
private int dd;
private int mm;
private int yy;

public Date() {
	
}
public Date(int dd,int mm,int yy) {
	this.dd=dd;
	this.mm=mm;
	this.yy=yy;
}

public String toString() {
	return (""+dd+mm+yy);
}
}
