import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String USERNAME = "harsha";
        final String PASSWORD = "password123";

        Scanner scanner = new Scanner(System.in);
        String inputUsername;
        String inputPassword;
        boolean isAuthenticated = false;

        System.out.println("WELCOME TO MALLAREDDY UNIVERSITY");

        do {
            System.out.print("Enter Username: ");
            inputUsername = scanner.nextLine();

            System.out.print("Enter Password: ");
            inputPassword = scanner.nextLine();

            if (inputUsername.equals(USERNAME) && inputPassword.equals(PASSWORD)) {
                isAuthenticated = true;
                System.out.println("\nHave you visited our site earlier, " + USERNAME + "!");
            } else {
                System.out.println("\nInvalid Username or Password. Please try again.\n");
            }
        } while (!isAuthenticated);

        scanner.close();
    }
}