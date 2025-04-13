import java.util.Scanner;

public class Activity6_while_do_loop {

	public static void main(String[] args) {
		
		String answer = "yes";
		
		while (answer.equalsIgnoreCase("yes")) {
		
			Scanner u_input = new Scanner(System.in);
			System.out.print("Enter First Number: ");
			int x = Integer.parseInt(u_input.nextLine());
			System.out.print("Enter Second Number: ");
			int y = Integer.parseInt(u_input.nextLine());
			int sum = x + y;
			System.out.println("The sum of " + x + " and " + y + " is " + sum);

			System.out.print("Do you want to try again? Yes or No? ");
			answer = u_input.nextLine();

			if (answer.equalsIgnoreCase("yes")) {
				System.out.println("Let's add two numbers again..");
				System.out.println();
			}
		
		}
		
		if (answer.equalsIgnoreCase("no")) {
			System.out.println("Thank You and Goodbye <3");
		} else {
			System.out.println("Invalid Entry Yes or No! Program Terminated.");
		}

	}

}
