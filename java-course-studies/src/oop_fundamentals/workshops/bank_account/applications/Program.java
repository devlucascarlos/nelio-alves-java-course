package oop_fundamentals.workshops.bank_account.applications;

import oop_fundamentals.workshops.bank_account.entities.Account;

import java.util.Scanner;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Account account;

        double initialDeposit = 0.0;
        double depositValue = 0.0;
        double withdrawalValue = 0.0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWarning: Withdrawal tax $ 5.00\n");
        System.out.println("Please, enter your data to create an account!");

        System.out.print("\nEnter the account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the account holder: ");
        String name = sc.nextLine();
        char responseOne = validateInput(sc, "Is there an initial deposit (y/n)? ");

        if (responseOne == 'y') {
            System.out.print("Enter initial deposit value: $ ");
            initialDeposit = sc.nextDouble();
            account = new Account(name, number, initialDeposit);
        } else {
            account = new Account(name, number);
        }

        System.out.println("\nAccount data:\n" + account);

        System.out.println("\n-------------------\n");
        char responseTwo = validateInput(sc, "Would you like to make a deposit? (y/n) ");

        if (responseTwo == 'y') {
            System.out.print("Enter deposit value: $ ");
            depositValue = sc.nextDouble();
            account.deposit(depositValue);
        }

        System.out.println("\nAccount data:\n" + account);

        System.out.println("\n-------------------\n");
        char responseThree = validateInput(sc, "Would you like to make a withdrawal? (y/n) ");

        if (responseThree == 'y') {
            System.out.print("Enter withdrawal value: $ ");
            withdrawalValue = sc.nextDouble();
            account.withdraw(withdrawalValue);
            }

        System.out.println("\nAccount data:\n" + account);

        System.out.println("\n-------------------\n");
        char responseFour = validateInput(sc, "Would you like to print a bank statement? (y/n) ");

        if (responseFour == 'y') {

            System.out.println("\nStatement:\n");
            if (initialDeposit > 0) System.out.printf("Initial Dep -- $ %.2f%n", initialDeposit);
            if (depositValue > 0)   System.out.printf("Deposit ------ $ %.2f%n", depositValue);

            if (withdrawalValue > 0) {
                System.out.printf("Withdrawal --- $ -%.2f%n", withdrawalValue);
                System.out.println("Tax ---------- $ -5.00 ");
            }
        }

        System.out.println("\nAccount data:\n" + account);

        sc.close();
        }
        public static char validateInput(Scanner sc, String question) {
            System.out.print(question);
            char response = sc.next().charAt(0);

            while (response != 'y' && response != 'n') {
                System.out.println("\n- Invalid input! Please try again.\n");
                System.out.print(question);
                response = sc.next().charAt(0);
            }
            return response;
        }

    }

