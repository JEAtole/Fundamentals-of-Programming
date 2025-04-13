import java.util.Scanner;

public class Activity2_HouseHoldExpenses {

	public static void main(String[] args) {
		
		Scanner u_input = new Scanner(System.in);
		System.out.print("Enter your Family Name: ");
		String family_name = u_input.nextLine();
		System.out.print("No. of Family Members: ");
		int family_members = u_input.nextInt();
		System.out.print("Housing Expenses: ");
		int housing = u_input.nextInt();
		System.out.print("Food Expenses: ");
		int food = u_input.nextInt();
		System.out.print("Child Care Expenses: ");
		int childcare = u_input.nextInt();
		System.out.print("Transportation Expenses: ");
		int transportation = u_input.nextInt();
		System.out.print("Health Care Expenses: ");
		int healthcare = u_input.nextInt();
		System.out.print("Other Necessities Expenses: ");
		int other = u_input.nextInt();
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("Monthly costs of " + family_name + " family with " + family_members + " members in the family,");
		
		System.out.println();
		
		int monthly_total = housing + food + childcare + transportation + healthcare + other;
		System.out.println("Monthly Total: " + monthly_total);
		int annual_total = monthly_total * 12;
		System.out.println("Annual Total: " + annual_total);

	}

}
