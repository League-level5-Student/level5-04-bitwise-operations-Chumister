package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public static void printByteBinary(byte b) {
		byte bit = (byte) 0b100000;
		String binaryStr = "";
		while (bit != 0) {
			if ((b & bit) != 0) {
				binaryStr += "1";
			}else {
				binaryStr += 0;
			}
		}
		bit = (byte) ((bit & 0xFF)>>>1);
		
	}
	
	public static void printShortBinary(short s) {
		byte b1 = 0;
		byte b2 = 0;
		
		printByteBinary((byte) (s&0xFF));
		printByteBinary((byte) ((s&0xFF00)>>8));
	}
	
	public static void printIntBinary(int i) {
		short sh = 0;
		short ort = 0;
		printShortBinary((short) (i&0xFFFF));
		printShortBinary((short) ((i&0xFFFF0000)>>16));
	}
	
	public static void printLongBinary(long l) {
		printIntBinary ((short) (l&0xFFFFFFFF));
		printIntBinary ((short) (l&0xFFFFFFFF00000000L)>>32);
	}
	public static void main(String[] args) {
		byte b = (byte) 0b00010111;
		printByteBinary(b);
		short s = (short ) 0xFFFF;
		printShortBinary(s);
		int i = (int) 0b01010101010101010101010101010101;
		printIntBinary(i);
		long l = (long) 0b0101010101010101010101010101010101010101010101010101010101010101L;
		printLongBinary(l);
	}
}
