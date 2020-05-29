
public class InstructionRegister extends BaseMemElem {

	public short getOpCode() {
		return (short) (read() / 100);
	}

	public short getOperand() {
		return 0;
		
		// move to MAR
	}

	public String toString() {
		return new String("IR OK");
	}
}
