import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        //Read user input
        Scanner input = new Scanner(System.in);

        //crate an instance of Account
        Account myAccount = new Account();

        //display the default account info
        System.out.printf("Initial Name is: %s%n%n", myAccount.getName());

    }
}
