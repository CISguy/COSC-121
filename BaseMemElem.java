
public class BaseMemElem {
	
	private short value;

	public void BaseMemoryElemOut() {
		value = 0;
	}

	public short read() {
		return value;
	}

	public void write(short i) {
		value = i;
	}

	public String toString() {
		String s = new String();
		s += value;
		return s;
	
}


}
