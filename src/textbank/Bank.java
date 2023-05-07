package textbank;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;
        int size = 0;
        double[] accountBalances = new double[250];
        String[] accountHolders = new String[250];
        boolean active = true;

        while (active) {
            System.out.println("Bank Admin Menu:");
            System.out.println("Please Enter a Menu Option");
            System.out.println("(1): Add Customer to Bank");
            System.out.println("(2): Change Customer Name");
            System.out.println("(3): Check Account Balance");
            System.out.println("(4): Modify Account Balance");
            System.out.println("(5): Summary of All Accounts");
            System.out.println("(-1): Quit");

            userInput = input.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("Bank Add Customer Menu:");
                    System.out.println("Please enter an account balance");
                    double balance = input.nextDouble();
                    accountBalances[size] = balance;
                    System.out.println("Please enter the account name");
                    input.nextLine();
                    String name = input.nextLine();
                    accountHolders[size] = name;
                    System.out.println("Customer ID is: " + size);
                    size += 1;
                    break;
                case 2:
                    System.out.println("Bank Change Name Menu");
                    System.out.println("Please enter a customer ID to change their name");
                    int idA = input.nextInt();
                    System.out.println("What is the customer's new name?");
                    input.nextLine();
                    accountHolders[idA] = input.nextLine();
                    break;
                case 3:
                    System.out.println("Bank Balance Menu");
                    System.out.println("Please enter an account ID to view its balance");
                    int idB = input.nextInt();
                    System.out.println("The balance for " + accountHolders[idB] + " account is: £" + accountBalances[idB]);
                    break;
                case 4:
                    System.out.println("Bank Modify Balance Menu");
                    System.out.println("Please enter a customer ID to modify the balance");
                    int idC = input.nextInt();
                    System.out.println("Please enter your new balance: ");
                    accountBalances[idC] = input.nextDouble();
                    break;
                case 5:
                    System.out.println("Summary of all Customers and Accounts");
                    double total = 0;
                    for (int i = 0; i < size; i++) {
                        total += accountBalances[i];
                        System.out.println("Account holder " + accountHolders[i] + " has a balance of: £" + accountBalances[i]);
                    }
                    System.out.println("In total the bank has £" + total + " in accounts");
                    break;
                case -1:
                    System.out.println("Exiting application, thank you");
                    active = false;
                    break;
                default:
                    System.out.println("Please choose from the options provided");
            }

        }
    }
}
