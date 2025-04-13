import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Activity8_ArrayList {

	public static void main(String[] args) {

		Scanner u_input = new Scanner(System.in);
		
		String[] order_print = {"Coke Php 20", "Royale Php 23", "Sprite Php 19", "Sarsi Php 25"};
		String[] beverages = {"Coke", "Royale", "Sprite", "Sarsi"};
		int[] price = {20, 23, 19, 25};
		int price_sum = 0;
		ArrayList<String> ordered_beverages = new ArrayList<>();
		
		String answer = "yes";
		
		while (answer.equalsIgnoreCase("yes")) {
			System.out.println("Beverage Available: Coke = P20, Royale = P23, Sprite = P19, Sarsi = P25");
			System.out.println("Purchase Beverage");
			String order = u_input.nextLine();
			
			for (int i = 0; i < beverages.length; i++) {
				if (beverages[i].equalsIgnoreCase(order)) {
					ordered_beverages.add(order_print[i]);
					price_sum = price_sum + price[i];
				}
			}
			
			System.out.print("Do you want to add more? Yes or No? ");
			answer = u_input.nextLine();
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("Please Pay Your Beverage");
		Collections.sort(ordered_beverages);

		for (String orderedBeverage : ordered_beverages) {
			System.out.println(orderedBeverage);
		}

		System.out.println("Total Amount: " + price_sum);

	}

}
