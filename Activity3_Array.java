import java.util.Scanner;

public class Activity3_Array {

	public static void main(String[] args) {

		Scanner u = new Scanner(System.in);
		
		String[] studname = {"James Cooper", "Princess Smith", "Dianna Ross", "James Butler"};
		String[] idnumber = {"2022-001", "2022-002", "2022-003", "2022-004"};
		String[] course = {"BSIT", "BSCS", "BSIS", "BSEMC"};
		String[] sports = {"Basketball", "Badminton", "Swimming", "Baseball"};
		String[] contact = {"0920864756", "09178765454", "09167657382", "09108877635"};

		System.out.println("Students Name: " + studname[0] + " , " + studname[1] + " , "+ studname[2] + " , "+ studname[3]);
		System.out.print("Enter Student Index: ");
		int index = u.nextInt();

		System.out.println();
		
		System.out.println("Index Number: " + index);
		System.out.println("Student ID: " + idnumber[index]);
		System.out.println("Name of Student: " + studname[index]);
		System.out.println("Course: " + course[index]);
		System.out.println("Sports: " + sports[index]);
		System.out.println("Contact No.: " + contact[index]);

	}

}
