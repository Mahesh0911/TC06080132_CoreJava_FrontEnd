package session_07;

public class EnumDemo {


	public enum Seasons{SUMMER,WINTER,AUTUMN,RAINY};
	
	
	public static void main(String[] args) {
		Seasons season=Seasons.RAINY;
		System.out.println("Season is :"+season);
		
		for (Seasons s: Seasons.values()) {
			System.out.println("Season :"+s.ordinal());
		}
		
		
	}
}
