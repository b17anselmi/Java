/*given a letter input, display corresponding number on a phone keypad
 * 2 = 65-67, 97-99
 * 3= 68-70, 100-102
 * 4=71-73, 103-105
 * 5=74-76, 106-108
 * 6= 77-79, 109-111
 * 7= 80-83, 112-115 
 * 8= 84-86, 116-118
 * 9= 87-90, 119-122
 */
import java.util.Scanner;
public class PhoneKeyPad {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter:");
		
		char letter = input.next().charAt(0);
		int ascii = letter;
		
		if (ascii <65 || (ascii>90 && ascii<97) || ascii>122) {
			System.out.println("Invalid input.");
			}
		else {
			int number=0;
			if ((letter>=65 && letter<=67) || (letter >=97 && letter <=99)) {
				number = 2;
			}
			else if ((letter>=68 && letter<=70) || (letter >=100 && letter <=102)) {
				number = 3;
			}
			else if ((letter>=71 && letter<=73) || (letter >=103 && letter <=105)) {
				number = 4;
			}
			else if ((letter>=74 && letter<=76) || (letter >=106 && letter <=108)) {
				number = 5;
			}
			else if ((letter>=77 && letter<=79) || (letter >=109 && letter <=111)) {
				number = 6;
			}
			else if ((letter>=80 && letter<=83) || (letter >=112 && letter <=115)) {
				number = 7;
			}
			else if ((letter>=84 && letter<=86) || (letter >=116 && letter <=118)) {
				number = 8;
			}
			else if ((letter>=87 && letter<=90) || (letter >=119 && letter <=122)) {
				number = 9;
			}
			System.out.println("The correspoinding number is " + number);
		} 

	}

}
