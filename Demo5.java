import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String correctUsername = "001";
        String correctPassword = "user_001";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Happy new year 2025");
        } else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }
}