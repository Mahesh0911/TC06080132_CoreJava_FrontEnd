package session_06;

public interface ArithCalc {

	// data members are always static and final in interface
	int x=0;
	int y=0;		
	
	//methods are always abstract
	int add(int a,int b);
	int sub(int a,int b);
}
