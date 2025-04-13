import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		String name;
		int num1, num2, sum;
		float midterm, finals, grade;
		
		Scanner u_input = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		name = u_input.nextLine();
		System.out.print("Enter Your Num1: ");
		num1 = u_input.nextInt();
		System.out.print("Enter Your Num2: ");
		num2 = u_input.nextInt();
		
		System.out.print("Enter Your Midterm Grade: ");
		midterm = u_input.nextFloat();
		System.out.print("Enter Your Final Grade: ");
		finals = u_input.nextFloat();
		
		grade = (midterm + finals)/2;
		System.out.println("Your encoded grade is: " + grade);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("Welcome home " + name);
		System.out.println("First number is " + num1);
		System.out.println("Second number is " + num2);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		sum = num1 + num2;
		System.out.println("The sum of the 1st and 2nd number is " + sum);
		
		System.out.println();
		System.out.println();
		System.out.println();

	}

}
