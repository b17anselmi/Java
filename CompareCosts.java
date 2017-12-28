// given a package weight and cost, decide which is the better price per unit
import java.util.Scanner;

public class CompareCosts {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first package weight and price.");
		double weight, price;
		weight = input.nextDouble();
		price = input.nextDouble();
		
		System.out.println("Enter second package weight and price.");
		double weight2, price2;
		weight2 = input.nextDouble();
		price2 = input.nextDouble();
		//calculate the price per unit of each package.
		double per1, per2;
		per1 = weight/price;
		per2 = weight2/price2;
		
		if (per1 == per2) {
			System.out.println("Same value.");
		}
		else if (per1 >per2) {
			System.out.println("Package 1 is the better deal.");
		}
		else if (per1<per2) {
			System.out.println("Package 2 is the better deal.");
		}

	}

}
