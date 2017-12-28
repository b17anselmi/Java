//user enter exchange rate, which way they want to convert, and then calculate exchange amount
import java.util.Scanner;

public class CurrencyExchange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//I'm going to make this more flexible than exercise asks for
		String from = "", to ="";
		System.out.println("Enter the currency you would like to convert from.");
		from = input.nextLine();
		System.out.println("Enter the currency you would like to convert to.");
		to = input.nextLine();
		System.out.println("Enter the exchange rate from " + from + " to "+ to +".");
		double rate = input.nextDouble();
		System.out.println("Enter the " + from + " amount.");
		double amount = input.nextDouble();
		/*System.out.println("Enter 0 if you would like to convert from " + from+ " to " + to + " or 1 if you would like to convert " + to + " to "+ from + ".");
		 * exercise asked for user to input 0 or 1, but that's unnecessary with my code. Otherwise I would use if statements and all that
		 * int choice = input.nextInt();
		 * if (choice ==0) {
			
		}*/
		double exchange = amount*rate;
		System.out.println(amount + " "+ from + " is " + exchange + to + ".");

	}

}
//note: if you use book tests, you have to convert the conversion rate 6.81 rmb/usd to 0.1468 usd/rmb, so it's not perfect, but still more flexible
