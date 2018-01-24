package cs1050;

import java.util.Arrays;

public class ByeWorld {
    public static void main(final String[] args) {
        boolean[] seed = {true,false,false,false};
        boolean[] coefs = {false,false,true,true};
        boolean[] seedCopy = java.util.Arrays.copyOf(seed,seed.length);
        char eChar = encodeCharLFSR('*',seed,coefs);
        char dChar = encodeCharLFSR(eChar, seedCopy, coefs);
		if (dChar == '*') {
			System.out.println("success");
		} else {
			System.out.println("failure");
		}
	testLFSR("Hello world", seed, coefs);
	    }

	   /**
	 * Print 1 character to System.out
	 * For example printCharInt('*') prints 42
	 * @param c the character to print
	 */ 
	static void printCharInt(char c) {
	    int i = c;
	    System.out.println(i);
	}

	/**
	 * Print the base 2 of an integer
	 * For example printIntBase2(42) should print 101010
	 * @param n the number to print
	 */ 
	static void printIntBase2(int n) {
				String b = "";
			  while (n != 0) {
			   b += n % 2;
			   n /= 2;
			  }
			 String real_b= new StringBuilder(b).reverse().toString();
			  System.out.println(real_b);  
			
		}

	/**
	 * Print the given bit array to System.out
	 * It should print 1 for each true value and 0 for a false one
	 * @param arr the boolean array to print
	 */ 
	static boolean[] ch2bitArray(char c) {
		    int i = c;//push the char to an int so that the below method can work
		    String str = Integer.toBinaryString(i);//convert it to binary so all we have is 1s and 0s
		    char[] strC = str.toCharArray();//convert it to an array so that we can easily iterate through it 
		  //checking, to be deleted
			System.out.println(i + " = " + str); 
		    boolean[] bin = new boolean[strC.length];
		    int k = 0;
		    for(int k1 = 0; k1<strC.length; k1++) {
		       bin[k1] = (strC[k1] == '1');
		       k1++;
		    }
		    
		    return bin;
		}


	/** part 2
	 * Convert a char into a 16 bits array
	 * @param c the char to print
	 * @return a boolean array of length 16 representing the bit presentation of the character
	 */ 
	static boolean[] char2bitArray(char c) {
	    int i = c;//push the char to an int so that the below method can work
	    String str = Integer.toBinaryString(i);//convert it to binary so all we have is 1s and 0s
	    char[] strC = str.toCharArray();//convert it to an array so that we can easily iterate through it 

	    boolean[] bin = new boolean[16];
	    for(int k = 0; k<str.length(); k++) {
	        if(strC[i] == '1') {
	            bin[i] = true;
	        }
	        else {
	            bin[i] = false;
	        }
	    }
	    return bin;
	}
	/**
		 * Convert a 16 bits array into a char
		 * @param arr a boolean array of length 16 representing a bit array 
		 * @return the character denoted by the bit array
		 */ 
		static char bitArray2char(boolean[] arr) {
			//inverse of previous method
			String bin_code = "";//initialize an empty string we can store the binary number in
			for(int z = 0; z<arr.length;z++) {
				if (arr[z] == true) {
					bin_code += "1";
				}
				else {
					bin_code += "0";
				}
			}
			int inte = Integer.parseInt(bin_code,2);//turn the binary string into an integer (2 denotes that it's binary)
			char character = (char) inte;//push the integer we decoded from array to a character with that ascii code
			return character;
		}

	/**
		 *[x] Test the previous two coding functions by converting the text into an array of characters. 
		 *[x] Then for each character, it converts it into a bit array and then converts the bit array back into a character.
		 *[x] Finally, the program constructs a new String given an array of all the generated characters.
		 *[x] Print the text before and after the transformations.
		 *@param text an input string to test
		 */ 
		static void testCoding(String text) {
			System.out.println("Pre encoding: " + text);
			
			char[] text_arr = text.toCharArray();//break text down into char[] =>{'h','e','l'.......'o'}
			boolean[][] bitArray = new boolean[text_arr.length][7];
			int col = 0;
			for(int rw = 0; rw < text_arr.length; rw++) {
					bitArray[rw] = ch2bitArray(text_arr[rw]); // H =>[[true, false, true, false],
															// e => [false, true, true, false]] or whatever the binary values are
			}
			//now the message is encoded in binary, so we have to decode it back into characters 
			//try storing them in text_arr since it's not being used, note I checked it with a new array as well 
			for(int ind=0; ind<bitArray.length; ind++) {
				text_arr[ind] = bitArray2char(bitArray[ind]); //=> {'H', 'e', . . . .'o'}
			}
			String pst_text = new String(text_arr);//push it into a string
			System.out.println("Post encoding: " + pst_text);	
		}

	/**Part 3
	 * Computes the next bit of LFSR
	 * @param arr the bit array (initially the seed)
	 * @param coefs the binary coefficients
	 * @return a boolean which is the combination of adding (modulo 2) the multiplication of each current bit with a coefficient
	 */ 
	static boolean FeedbackLFSR(boolean[] arr, boolean[] coefs) {
			int sum = 0;
		    for(int i = 0; i < arr.length; i++) {
		    	if (arr[i] && coefs[arr.length-1-i]) {
		    		sum++;
		    	}
		    
		    	}
			if (sum%2 == 1) {
		    	return true;
		    	}
			else {
				return false;
			}
		}

	/**
	 * Computes the next state of the bit array
	 * @param arr the bit array (initially the seed)
	 * @param coefs the binary coefficients
	 * @return a boolean which is the combination of adding (modulo 2) the multiplication of each current bit with a coefficient
	 */ 
	static boolean FeedbackLFSR(boolean[] arr, boolean[] coefs){
		int sum=0;
	    for(int i=0; i<arr.length; i++){
	    	if (arr[i]&&coefs[i]){
	    		sum++;
	    	}
	    
	    	}
		if (sum%2==1) {
	    	return true;
	    	}
		else {
			return false;
		}
	}
	static boolean feedbackUpdateLFSR(boolean[] arr, boolean[] coefs){
		boolean next = FeedbackLFSR(arr, coefs);
		boolean ret = arr[arr.length-1];
	   for(int i =arr.length-1; i>1;i--){
	   	arr[i]=arr[i-1];
	   	}
	   	arr[0]=next;
	   	return ret;
	   }
	/**
	 * Encode the char by XORing each bit with the returned one from feedbackUpdateLFSR 
	 * @param c the char to encode
	 * @param arr the bit array (initially the seed)
	 * @param coefs the binary coefficients
	 * @return the encoded char
	 */ 
	static char encodeCharLFSR(char c, boolean[] arr, boolean[] coefs){
		boolean[] binC=Part2_1.ch2bitArray(c);
		//xor
		boolean[] eChar=new boolean[binC.length];
		for(int k=0;k<binC.length; k++) {
			if(binC[k]==feedbackUpdateLFSR(arr,coefs)) {
				eChar[k] =false;
			}
			else {
				eChar[k] =true;
			}
		}
		return Part2_1.bitArray2char(eChar);
	    
	}
	/**
	 * Encode the char array by encoding each char in it
	 * @param chars the char array to encode
	 * @param arr the bit array (initially the seed)
	 * @param coefs the binary coefficients
	 * @return the encoded char
	 */ 
	static char[] encodeCharArrayLFSR(char[] chars, boolean[] arr, boolean[] coefs){
	    char[] code=new char[chars.length];
	    for(int r=0; r<chars.length;r++) {
	    	code[r]=encodeCharLFSR(chars[r],arr, coefs);
	    }
	   return code;
} 
	static void testLFSR(String text, boolean[] arr, boolean[] coefs){
	boolean[] oSeed= Arrays.copyOf(arr,arr.length);
	//encode the text
	 char[] textChar=text.toCharArray();
	 char[] code= encodeCharArrayLFSR(textChar, arr, coefs);
	 String coded= new String(code);
	 System.out.println("Encoded Message is: "+coded);
	 
	 //decode the text
	 String decode=new String(encodeCharArrayLFSR(code, oSeed, coefs));	 
	 System.out.println("Decoded message: "+decode);
	}
	}