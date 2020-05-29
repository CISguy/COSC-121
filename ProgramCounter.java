
public class ProgramCounter extends BaseMemElem {
	
	public ProgramCounter() {
		super();
	}

	
	public void inc() {
	write((short)(read()+1));	
	}
	public String toString() {
		String s = new String();
		s += "PC OK";
		return s;
		
	}


	public int set(int i) {
		return 0;
		
	}
	
}

