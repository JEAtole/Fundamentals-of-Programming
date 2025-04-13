import java.util.Scanner;

public class Activity7_forloop_authentication {

	public static void main(String[] args) {

		Scanner u_input = new Scanner(System.in);
		
		String[] username = {"Admin", "Manager", "User", "Guest"};
		String[] password = {"admin123", "manager123", "user123", "guest123"};
		
		System.out.print("Enter your username: ");
		String username_input = u_input.nextLine();
		System.out.print("Enter your password: ");
		String password_input = u_input.nextLine();
		
		for (int i = 0; i < username.length; i++) {
			if ((username_input.equalsIgnoreCase(username[i])) && (password_input.equals(password[i]))) {
				System.out.println("Access Granted to " + username[i]);
				break;
			} else if (i == username.length - 1) {
				System.out.println("You are not Authorized");
			}		
		} 

	}

}
