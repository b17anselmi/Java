/*use Zeller's congruence to calculate the day of the week
 * h = (q +26*(m+1)/10 + k + k/4 + j/4 + 5*j) %7
 * h = day of the week (0 = Saturday, 1 = Sunday, etc)
 * q = day of the month
 * m = month (3 = March, 4 = April, etc. January and February are 13 and 14 of the previous year)
 * j = century (year/100)
 * k = year of century (year%100)
 * user enter year, month and day, program display day of the week 
 */
import java.util.Scanner;

public class dayofthewk {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the day of the month:");
		int h, q, m, year, j, k;
		q = input.nextInt();
		System.out.println("Enter the month (1-12):");
		m = input.nextInt();
		System.out.println("Enter the year: ");
		year = input.nextInt();
		
		//now we can start calculating
		if (m == 1) {
			m = 13;
			year -= 1;
		}
		else if (m==2) {
			m = 14;
			year -= 1;
		}
		
		j = year/100;
		k = year%100;
		h = (q +26*(m+1)/10 + k + k/4 + j/4 + 5*j) %7;
		//this could be made more nice with arrays, but that's for another day
		switch (h) {
		case 0: System.out.println("The day of the week is Saturday"); break;
		case 1: System.out.println("The day of the week is Sunday"); break;
		case 2: System.out.println("The day of the week is Monday"); break;
		case 3: System.out.println("The day of the week is Tuesday"); break;
		case 4: System.out.println("The day of the week is Wednesday"); break;
		case 5: System.out.println("The day of the week is Thursday"); break;
		case 6: System.out.println("The day of the week is Friday"); break;
		
		}
		
		
		

	}

}
