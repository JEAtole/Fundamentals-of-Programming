import java.util.ArrayList;
import java.util.Collections;

public class Array_List {

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<>();
		cars.add("Honda");
		cars.add("Toyota");
		cars.add("Mazda");
		cars.add("Suzuki");

		System.out.println(cars);

		System.out.println(cars.get(0));
		System.out.println(cars.get(1));
		System.out.println(cars.get(2));
		System.out.println(cars.get(3));

		cars.set(0, "Ford");
		System.out.println(cars.get(0));

		cars.remove(2);
		System.out.println(cars);

		cars.clear();
		System.out.println(cars);

		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Grapes");
		fruits.add("Guava");

		Collections.sort(fruits);

		for (String fruit : fruits) {
			System.out.println(fruit);
		}

	}

}
