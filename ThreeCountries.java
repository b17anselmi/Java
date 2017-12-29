//given three countries, order them in descending order by length  (?)
// exercise 4.25

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class ThreeCountries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//storing country names in an array
		String [] countries= new String[3];
		System.out.println("Enter first country: ");
		countries[0]= sc.nextLine();
		System.out.println("Enter second country: ");
		countries[1]= sc.nextLine();
		System.out.println("Enter third country: ");
		countries[2]= sc.nextLine();
		sc.close();
	
		Arrays.sort(countries, Comparator.comparingInt(String::length)); //sorts in ascending order
		
		System.out.println("The three countries in descending order are " + countries[2] + " " + countries[1] + " " + countries[0]);
		
	}

}
