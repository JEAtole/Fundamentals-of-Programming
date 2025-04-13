import java.util.Scanner;

public class java_for_loop {

	public static void main(String[] args) {
		
		/*
			SYNTAX:
				for (initialization; condition; operation){
					// do anything here...
				}
			EXAMPLE:
		 */

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		System.out.println("\n--------------------\n");

		// Iterating Array using For Loop

		String[] fruits = {"Apple", "Banna", "Orange", "Mango", "Grapes"};

		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		System.out.println("\n--------------------\n");

		// Fruit Finder

		Scanner u_input = new Scanner(System.in);
		String[] fruits2 = {"Apple", "Banana", "Orange", "Mango", "Grapes"};
		System.out.print("Find your fruit: ");
		String find = u_input.nextLine();

		for (String fruit : fruits2) {
			if (fruit.equalsIgnoreCase(find)) {
				System.out.println("We found your fruit " + fruit);
				break;
			} else {
				System.out.println(fruit);
			}
		}

	}

}
