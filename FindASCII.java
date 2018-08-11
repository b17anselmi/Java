//given a letter, display ASCII
import java.util.Scanner;
public class FindASCII {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Character");
		//disgusting
		char letter = input.next().charAt(0);
		int ascii = letter;
		
		System.out.println("The ASCII code for "+letter + " is " + ascii);

	}

}
