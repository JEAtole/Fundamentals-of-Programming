import java.util.Scanner;

public class Activity4_IFELSE_Grade_Ave {

	public static void main(String[] args) {

		Scanner u = new Scanner(System.in);
		
		System.out.print("English: ");
		float english = u.nextFloat();
		System.out.print("Math: ");
		float math = u.nextFloat();
		System.out.print("Science: ");
		float science = u.nextFloat();
		System.out.print("Computer: ");
		float computer = u.nextFloat();
		
		float average = (english + math + science + computer)/4;
		System.out.println("AVERAGE: " + average);
		System.out.print("REMARKS: ");
		
		if ((average >= 0) && (average < 75)) {
			System.out.println("Failed");
		} else if (average < 90) {
			System.out.println("Passed");
		} else if (average < 95) {
			System.out.println("Good");
		}  else if (average < 98) {
			System.out.println("Very Good");
		}  else if (average < 101) {
			System.out.println("Excellent");
		} else {
			System.out.println("Invalid input on Grade");
		}

	}

}
