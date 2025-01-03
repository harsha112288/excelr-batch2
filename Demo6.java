import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String correctUsername = "harsha";
        String correctPassword = "harsha@123";

        Scanner scanner = new Scanner(System.in);

        System.out.print("name: ");
        String username = scanner.nextLine();

        System.out.print("password: ");
        String password = scanner.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Welcome harsha");
        } else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }
}