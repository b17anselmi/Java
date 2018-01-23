package cs1050;

public class Part2_1 {

	public static void main(String[] args) {
		Part2_1.ch2bitArray('*');
		//testing part 2.2, clear
		boolean[] bite= {true, false,true, false,true, false};
		System.out.println(bitArray2char(bite));
		testCoding("Hello");

	}
	static boolean[] ch2bitArray(char c){
	    int i=c;//push the char to an int so that the below method can work
	    String str=Integer.toBinaryString(i);//convert it to binary so all we have is 1s and 0s
	    char[] strC = str.toCharArray();//convert it to an array so that we can easily iterate through it 
	  //checking, to be deleted
		System.out.println(i + " = " +str); 
	    boolean[] bin=new boolean[strC.length];
	    int k=0;
	    do{
	    	//more checking, delete later
	  //  	System.out.println(strC[k]);
	       bin[k]=(strC[k]=='1');
	       k++;
	    }while(k<strC.length);
	 	//final check, delete later
	    for(int l=0; l<bin.length;l++) {
	   
	    //	System.out.println(bin[l]);
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
		String bin_code="";//initialize an empty string we can store the binary number in
		for(int z = 0; z<arr.length;z++) {
			if (arr[z]==true) {
				bin_code+="1";
			}
			else {
				bin_code+="0";
			}
		}
		int inte= Integer.parseInt(bin_code,2);//turn the binary string into an integer (2 denotes that it's binary)
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
		System.out.println("Before transformation: "+text);
		
		char[] text_arr=text.toCharArray();//break text down into char[] =>{'h','e','l'.......'o'}
		boolean[][] bitArray= new boolean[text_arr.length][7];
		int col=0;
		for(int rw=0; rw<text_arr.length; rw++) {
				bitArray[rw]=ch2bitArray(text_arr[rw]); // H =>[[true, false, true, false],
														// e => [false, true, true, false]] or whatever the binary values are
		}
		//now the message is encoded in binary, so we have to decode it back into characters 
		//try storing them in text_arr since it's not being used, note I checked it with a new array as well 
		for(int ind=0; ind<bitArray.length; ind++) {
			text_arr[ind]=bitArray2char(bitArray[ind]); //=> {'H', 'e', . . . .'o'}
			System.out.println(text_arr[ind]);
		}
		String pst_text = new String(text_arr);//push it into a string
		System.out.println("The decoded message is: "+pst_text);	
	}

}
