//given a character, determine if it is a vowel, a consonant, or an invalid input
import java.util.Scanner;

public class VowelorConsonant {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter:");
		
		char letter = input.next().charAt(0);
		int ascii = letter;
		//first determine if the character is a letter
		if (ascii <65 || (ascii>90 && ascii<97) || ascii>122) {
			System.out.println("Invalid input.");
		}
		else if (ascii == 65 || ascii == 69 || ascii == 79 || ascii == 73 || ascii == 85 || ascii == 89 || ascii == 97 || ascii == 101 || ascii == 105 ||ascii == 111 ||ascii == 117 || ascii == 121 ){
			System.out.println(letter +" is a vowel.");
			
		}
		else {
			System.out.println(letter+" is a consonant");
		}

	}

}
