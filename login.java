
import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        String correctUsername = "admin";
        String correctPassword = "123456";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Incorrect username or password.");
        }

        scanner.close();
    }
}
}
