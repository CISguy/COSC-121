import java.util.Scanner;

public class Input {

	public Input() {

	}

	public short getInput() {
		Scanner in = new Scanner(System.in);
		System.out.print("?");
		return in.nextShort();

	}

	public String toString() {
		return new String("INPUT OK");

	}



}