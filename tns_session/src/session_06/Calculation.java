package session_06;

public class Calculation extends CompareCalc implements StaticCalc,factorial {
	
	@Override
	public double avg(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b)/2;
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b);
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return (a-b);
	}

	@Override
	public int fact(int n) {
		int result=1;
		for(int i=1;i<=n;i++) {
			result*=i;
		}
		return result;
	}

}
