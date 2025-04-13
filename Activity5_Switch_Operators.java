import java.util.Scanner;

public class Activity5_Switch_Operators {

	public static void main(String[] args) {
		Scanner u = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		float num1 = u.nextFloat();
		System.out.print("Enter Second Number: ");
		float num2 = u.nextFloat();
		System.out.println("Select Operator to be used: \n 1 => Multiplication \n 2 => Division \n 3 => Subtraction \n 4 => Addition");
		int choice = u.nextInt();

		switch (choice) {
			case 1 -> {
				float product = num1 * num2;
				System.out.println("The product of " + num1 + " and " + num2 + " is " + product);
			}
			case 2 -> {
				float quotient = num1 / num2;
				System.out.println("The quotient of " + num1 + " and " + num2 + " is " + quotient);
			}
			case 3 -> {
				float difference = num1 - num2;
				System.out.println("The difference of " + num1 + " and " + num2 + " is " + difference);
			}
			case 4 -> {
				float sum = num1 + num2;
				System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
			}
			default -> System.out.println("Invalid Selection of Operators");
		}

	}

}
