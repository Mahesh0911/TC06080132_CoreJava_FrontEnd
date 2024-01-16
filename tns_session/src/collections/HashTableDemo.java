package collections;

public class HashTableDemo {
	int i;
	
	public HashTableDemo(int i) {
		this.i=i;
	}
	
	@Override
	public int hashCode() {
		return i;
	}
	
	@Override
	public String toString() {
		return "i = "+i+" ";
	}
}

/*
 * Hashtable Demo is implemented in HashMaps class.
 *
 */