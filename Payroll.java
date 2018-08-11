/*given employee name, hours worked, pay rate, and federal and state withholding rates, calculate and output payroll statement in following format
 * Name:
 * Hours Worked:
 * Pay Rate:
 * Gross Pay:
 * Deductions:
 * 		Federal Withholding:
 * 		State Withholding:
 * 		Total Deduction:
 * Net pay:
 * exercise 4.23
 */
import java.util.Scanner;
public class Payroll {

	public static void main(String[] args) {
		//get information
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee's name:");
		String name = sc.nextLine();
		System.out.println("Enter number of hours worked in a week:");
		double hours, rate, fed_tax, state_tax;
		hours = sc.nextDouble();
		System.out.println("Enter hourly pay rate:");
		rate = sc.nextDouble();
		System.out.println("Enter federal tax withholding rate:");
		fed_tax = sc.nextDouble();
		System.out.println("Enter state tax withholding rate:");
		state_tax = sc.nextDouble();
		sc.close();
		//make calculations ot find other information
		double gross, deductions, state_withholdings, fed_withholdings, net;
		gross = hours*rate;
		state_withholdings = gross*state_tax;
		fed_withholdings = gross*fed_tax;
		deductions = state_withholdings + fed_withholdings;
		net = gross - deductions;
		//output formatted payroll
		System.out.println('\n' + "Employee Name: " + name + '\n' + "Hours Worked: " + hours + '\n' + "Pay Rate: $"+ rate + '\n' + "Gross Pay: $" + gross + '\n');
		System.out.println("Deductions: " + '\n' + '\t'+"Federal Withholding: $" + fed_withholdings+'\n'+'\t'+ "State Withholding: $" + state_withholdings + '\n'+'\t' + "Total Deduction: $" + deductions +'\n');
		System.out.println("Net Pay: $" + net);

	}

}
