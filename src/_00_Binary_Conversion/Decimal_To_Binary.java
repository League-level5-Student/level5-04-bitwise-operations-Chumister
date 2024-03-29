package _00_Binary_Conversion;

import java.util.Iterator;

public class Decimal_To_Binary {
	public static void main(String[] args) {
		//Converting a decimal number to binary is a little trickier.
		//EXAMPLE: Convert 43 to binary
		/*
		 * Step 1: Start with one and add a digit the left that is double the value of the previous number.
		 *         Stop when you've passed the target number        
		 *         eg. 43
		 *         	64	32	16	8	4	2	1
		 *        
		 *	Step 2: Remove the left most value (the one that is higher than the target). 
		 *			eg. 43
		 *         	32	16	8	4	2	1
		 *         
		 *  Step 3: Find the combination of values that add up to the target number.
		 *  		eg. 43
		 *         	32	16	8	4	2	1
		 *          43 = 32 + 8 + 2 + 1
		 *         
		 *  Step 4: Every matching number in the list is a 1, and non-matching is a 0.
		 *  		eg. 43
		 *         	32	16	8	4	2	1
		 *          43 = 32 + 8 + 2 + 1
		 *         
		 *          1    0   1   0   1   1
		 *          32	16	 8	 4	 2	 1
		 *         
		 *         43 in decimal is 101011 in binary!
		 */
		String binary = convertDecimalToBinary(32);
		String s = "";
		for (int i = 0; i < 8-binary.length(); i++) {
			s+="0";
		}
		s+=binary;
		String newString = "";
		for (int i =0; i < s.length();i++) {
			if (s.charAt(i)=='0') {
				newString+="1";
			}else if (s.charAt(i)=='1') {
				newString+="0";
			}
			
		}
		String finalString="";
		for (int i = 0; i < newString.length(); i++) {
			finalString+=newString.charAt(i);
		}
		finalString+="1";
		
		System.out.println(finalString);
	}
		
	public static String convertDecimalToBinary(int i) {
		String binStr = "";
		 do {
	            // 1. Logical right shift by 1
	            int quotient = i >>> 1;
	        
	            // 2. Check remainder and add '1' or '0'
	            if( i % 2 != 0 ){
	                binStr = '1' + binStr;
	            } else {
	                binStr = '0' + binStr;
	            }
	            
	            i = quotient;
	            
	        // 3. Repeat until number is 0
	        } while( i != 0 );
	        
	        return binStr;
	}
}
