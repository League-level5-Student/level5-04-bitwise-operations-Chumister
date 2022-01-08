package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public void printByteBinary(byte b) {
		for (int i = 8; i > 0; i--) {
			int b2 = b >> (i-1);
			int b3 = b2 & 1;
			System.out.println(b3);
		}
		
	}
	
	public void printShortBinary(short s) {
		byte b1;
		byte b2;
		b1 = (byte) (s>>8);
		b2 = (byte) (s);
		printByteBinary(b1);
		printByteBinary(b2);
	}
	
	public void printIntBinary(int i) {
		
	}
	
	public void printLongBinary(long l) {
		
	}
}
