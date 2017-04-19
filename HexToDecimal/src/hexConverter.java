import java.util.Scanner;

public class hexConverter {

	public static void main(String[] args) {
		// pseudo-code -- half code / half english
		/*
		 * syso "Enter a headecimal number"
		 * Scanner - read that number as a string(0-9, A-F)
		 * parse that string, pulling it apart a char at a time
		 * (A-10, B-11, C-12, D-14, E-15, F-16)
		 * 
		 * ex: F03A -> A, 3, 0, F
		 * A  * base^0 -> A * 1 = 10decimal
		 * 3 * base^1 ->  3 * 16 = 48decimal
		 * 0 * base^2 ->  0decimal
		 * F * b^3 -> 	  15 * 4096 = 61440decimal
		 * add those up to get your final decimal conversion -> 61498
		 * 
		 * do not use the built in methods in java API
		 */
		Scanner input = new Scanner(System.in);
		char hexChar;
		int numberAfterConversion;
		int compiledDecimal = 0;
		int convertStep;
				 
		System.out.println("Please Enter a Hexadecimal number:");
		String inputHex = input.next().toUpperCase();
		
		
		
		for(int i = (inputHex.length() - 1); i >= 0; i--){
			hexChar = inputHex.charAt(i);
			numberAfterConversion = charToInt(hexChar);
			//System.out.println("Number: " + numberAfterConversion);
			//System.out.println(hexChar);
			
			
			if(i == 3){
				convertStep = numberAfterConversion * 1;
				compiledDecimal += convertStep;
				//System.out.println("i=3 convertStep = " + convertStep + ", compiledDecimal = " + compiledDecimal);
			}
			if(i == 2){
				convertStep = numberAfterConversion * 16;
				compiledDecimal += convertStep;
				//System.out.println("i=2 convertStep = " + convertStep + ", compiledDecimal = " + compiledDecimal);
			}
			if(i == 1){
				convertStep = numberAfterConversion * 256;
				compiledDecimal += convertStep;
				//System.out.println("i=1 convertStep = " + convertStep + ", compiledDecimal = " + compiledDecimal);
			}
			if(i == 0){
				convertStep = numberAfterConversion * 4096;
				compiledDecimal += convertStep;
				//System.out.println("i=0 convertStep = " + convertStep + ", compiledDecimal = " + compiledDecimal);
			}
			else{
				System.out.println("error");
			}
			
			
			
		}

		System.out.println("Final number is : " + compiledDecimal);

	}

	private static int charToInt(char c) {

		int convertedInt = 0;

		switch (c) {

		case '0':
			convertedInt = 0;
			break;
		case '1':
			convertedInt = 1;
			break;
		case '2':
			convertedInt = 2;
			break;
		case '3':
			convertedInt = 3;
			break;
		case '4':
			convertedInt = 4;
			break;
		case '5':
			convertedInt = 5;
			break;
		case '6':
			convertedInt = 6;
			break;
		case '7':
			convertedInt = 7;
			break;
		case '8':
			convertedInt = 8;
			break;
		case '9':
			convertedInt = 9;
			break;
		case 'A':
			convertedInt = 10;
			break;
		case 'B':
			convertedInt = 11;
			break;
		case 'C':
			convertedInt = 12;
			break;
		case 'D':
			convertedInt = 13;
			break;
		case 'E':
			convertedInt = 14;
			break;
		case 'F':
			convertedInt = 15;
			break;

		}

		return convertedInt;
	}

}
