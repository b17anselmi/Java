// convert inputed letter grade A, B, C, D, or F to 4, 3, 2, 1
import java.util.Scanner;
public class LetterGrade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter letter grade:");
		
		char letter = input.next().charAt(0);
		int ascii = letter;
		if (ascii !=69 && (ascii >=65 && ascii <= 70)) {
			int grade=0;
			if (ascii == 65) {
				grade = 4;
			}
			else if (ascii ==66) {
				grade =3;
			}
			else if (ascii == 67) {
				grade = 2;
			}
			else if (ascii == 68) {
				grade = 1;
			}
			else if (ascii == 70) {
				grade = 0;
			}
			System.out.println("The numeric value for grade "+ letter + " is " + grade);
			}
		else {
			System.out.println("Invalid input.");
		}

	}

}
