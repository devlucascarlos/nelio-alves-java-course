package oop_fundamentals.workshops.bank_account.applications;

import oop_fundamentals.workshops.bank_account.entities.Account;

import java.util.Scanner;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Account account;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Warning: Withdrawal tax $ 5.00");
        System.out.println();
        System.out.println("Please, enter your data to create an account!");
        System.out.println();

        System.out.print("Enter the account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the account holder: ");
        String name = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char responseOne = sc.next().charAt(0);

        while (responseOne != 'y' && responseOne != 'n') {
            System.out.println();
            System.out.println("- Invalid input! Please try again.");
            System.out.println();
            System.out.print("Is there an initial deposit? (y/n) ");
            responseOne = sc.next().charAt(0);
        }

        if (responseOne == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(name, number, initialDeposit);
        } else {
            account = new Account(name, number);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println();
        System.out.println(account);

        System.out.println();
        System.out.print("Would you like to make a deposit? (y/n) ");
        char responseTwo = sc.next().charAt(0);

        while (responseTwo != 'y' && responseTwo != 'n') {
            System.out.println();
            System.out.println("- Invalid input! Please try again.");
            System.out.println();
            System.out.print("Would you like to make a deposit? (y/n) ");
            responseTwo = sc.next().charAt(0);
        }

        if (responseTwo == 'y') {
            System.out.print("Enter deposit value: ");
            double depositValue = sc.nextDouble();
            account.deposit(depositValue);

            System.out.println();
            System.out.println("Account data:");
            System.out.println();
            System.out.println(account);
        }

        System.out.print("Would you like to make a withdrawal? (y/n) ");
        char responseThree = sc.next().charAt(0);

        while (responseThree != 'y' && responseThree != 'n') {
            System.out.println();
            System.out.println("- Invalid input! Please try again.");
            System.out.println();
            System.out.print("Would you like to make a withdrawal? (y/n) ");
            responseThree = sc.next().charAt(0);
        }

        if (responseThree == 'y') {
            System.out.print("Enter withdrawal value: ");
            double withdrawalValue = sc.nextDouble();
            account.withdraw(withdrawalValue);

            System.out.println();
            System.out.println("Account data:");
            System.out.println();
            System.out.println(account);
            }
        }

    }

