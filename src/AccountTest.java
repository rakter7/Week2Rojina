import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        //Read user input
        Scanner input = new Scanner(System.in);

        //crate an instance of Account
        Account myAccount = new Account();
        String accName = input.nextLine(); //Read input and save in accName
        myAccount.setName(accName);
        //display the default account info
        System.out.printf("Initial Name is: %s%n%n", myAccount.getName());

        //Prompt the user for an account name
        System.out.printf("Please enter the user name: ");
        String accName1 = input.nextLine(); //Read input and save in accName
        myAccount.setName(accName1);
        System.out.println();

        //Display account information
        System.out.printf("Name of my  account is : %s%n",myAccount.getName());
    }
}
