package cs1050;
//Exercise 1 CS1050
import java.util.Scanner;
public final class Exercise1 {

	public static void main(final String[] args) {
		//testing part 1.1
		System.out.println("Enter a Character");
		Scanner s = new Scanner(System.in);
		char in= s.next().charAt(0);
		s.close();
		boolean[] bit= {true, false,true, false,true, false};
		printCharInt('*');//clear
		printIntBase2(42);//clear
		//printnit	Array(bit);//error, ask Tomer
	}
	//Part 1

	/**
	 * Print 1 character to System.out
	 * For example printCharInt('*') prints 42
	 * @param c the character to print
	 */ 
	static void printCharInt(char c) {
		int ascii = c;
		System.out.println(ascii);
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
		
	}//could also just divide/remainders by 2 using a while || do while(?) loop
	//for converting back, see https://goo.gl/images/VHcYq6
	/**
	 * Print the given bit array to System.out
	 * It should print 1 for each true value and 0 for a false one
	 * @param arr the boolean array to print
	 */ 
	static void printnitArray(boolean[] arr) {
		int i=0;
		do {
			if (arr[i]) {
				System.out.print("1");
			}
			else {
				System.out.print("0");
			}
			i++;
		}while(i<arr.length);
		//while loops are more abstract than for loops
		//for arrays, always use for loops
	}
	
//Part 2
}
