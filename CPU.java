
public class CPU {
	private BaseMemElem acc;
	private ProgramCounter pc;
	private InstructionRegister ir;
	private BaseMemElem mdr;
	private BaseMemElem mar;
	private boolean inFlag;
	private boolean outFlag;
	private boolean storeFlag;

	public CPU() {
		acc = new BaseMemElem();
		pc = new ProgramCounter();
		ir = new InstructionRegister();
		mdr = new BaseMemElem();
		mar = new BaseMemElem();
		inFlag = false;
		outFlag = false;
		storeFlag = false;
	}
	

    public boolean getStoreFlag() {
        if (ir.getOpCode() == 2) {
            return true;
        } else {
            return false;
        }
    }
    public boolean getInputFlag() {
        if (ir.getOpCode() == 7) {
            return true;
        } else {
            return false;
        }
    }
    public boolean getOutputFlag() {
        if (ir.getOpCode() == 8) {
            return true;
        } else {
            return false;
        }
    }

	public short getMDR() {
		return (short) mdr.read();
	}

	public int getMAR() {
		return mar.read();
	}
	
	private void fetch() {
		pc.set(0);
		mar = pc;
		mdr = ir.getOpCode();
		
		

	}
	
	private void execute() {
		
	}


	public String toString() {
		String s = new String();
		s += "ACC: " + acc + " PC: " + pc + " IR: " + ir + "\n" + "MDR: " + mdr + "MAR: " + mar
				+ "\nInput flag status: " + inFlag + "\nOutput flag status: " + outFlag + "\nStore flag status: "
				+ storeFlag;
		return s;
	}




}
