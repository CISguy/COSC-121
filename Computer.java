//import java.io.File;
//import java.util.Scanner;

public class Computer {
	private RAM myRam;
	private CPU myCpu;
	private Input myInput;
	private Output myOutput;

	public Computer() {
		myRam = new RAM();
		myCpu = new CPU();
		myInput = new Input();
		myOutput = new Output();
	}

	public void load(String fileName) {
		myRam.write((short) 799, 0);
		myRam.write((short) 798, 1);
		myRam.write((short) 199, 2);
		myRam.write((short) 398, 3);
		myRam.write((short) 293, 4);
		myRam.write((short) 897, 5);
		for (int i = 6; i < 100; i++)
			myRam.write((short) 0, i);
	}

	private void busRefresh() {
		if (myCpu.getInputFlag()) {
			myRam.write(myInput.getInput(), myCpu.getMAR());
		}
	}

	public void run() {
		while (!myCpu.getInputFlag() && !myCpu.getOutputFlag() && !myCpu.getStoreFlag()) {

			// Execute
			switch (myRam.set {
			case 0:
				break; // Stop
			case 1:
				break; // Load
			case 2:
				break; // Store
			case 3:
				break; // Add
			case 4:
				break; // Sub
			case 5:
				break; // MPY
			case 6:
				break; // DIV
			case 7:
				break; // IN
			case 8:
				break; // OUT
			case 9:
				break; // BR
			case 10:
				break; // BZ
			case 11:
				break; // BGTR
			}
		}
	}

	public String toString() {
		String s = new String();
		s += "Brian's Computer\n";
		s += myRam + "\n";
		s += myCpu + "\n";
		s += myInput + "\n";
		s += myOutput + "\n";
		return s;
	}

	public void fetch() {
		
		// TODO Auto-generated method stub
		
	}
}