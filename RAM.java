

public class RAM {
	private BaseMemElem[] mem;

	public RAM() {
		final int SIZE = 100;
		mem = new BaseMemElem[SIZE];
		for (int i = 0; i < SIZE ; i++)
			mem[i] = new BaseMemElem();
	}

	public void write(short value, int location) {
		mem[location].write(value);
	}

	public short read(int loc) {
		return (short) loc;

	}
	// toString all elements

	// toString all elements
	
	public String toString() {
		String s = new String();
		for(int i = 0; i < mem.length; i++) {
			if(i % 10 == 0)
				s+= "\n";
			s += mem[i].read() + " ";
		}
		return s;
		}
	
	}