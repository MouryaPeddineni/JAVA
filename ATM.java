package com.company;

import java.util.Scanner;

public class ATM {
    String account_id = "1234MOURYA007";
    int pin = 7204;
    float accountBalance = 532124.3f;
    int transactions = 0;
    String transactionHistory = "";

    Scanner scanner = new Scanner(System.in);

    public boolean login(){
        boolean isLoggedIn = false;
        System.out.println("Enter your user ID :");
        String enteredUserID = scanner.nextLine();

        if(enteredUserID.equals(account_id)){
            System.out.println("Enter PIN");
            int userEnteredPin = scanner.nextInt();
            if(pin==userEnteredPin){
                isLoggedIn = true;
            }
            else{
                System.out.println("The pin you entered is incorrect !");
            }
        }
        else {
            System.out.println("The account id you are trying to access doesn't exist !");
        }
        return isLoggedIn;
    }


    public void transactionHistory(){
        if(transactions == 0){
            System.out.println("No transactions.\n");
        }
        else{
            System.out.println(transactionHistory);
        }
    }


    public void withdraw(){
        System.out.println("Enter the amount you want to withdraw :");
        float amount = scanner.nextFloat();

        if(accountBalance >= amount){
            if(amount <= 10000){
                accountBalance -= amount;
                transactions++;
                String str = amount + " Rs. Withdrawn.\n";
                transactionHistory = transactionHistory.concat(str);
                System.out.println("Withdraw Successful.\n");
            }
            else{
                System.out.println("Limit is 10000.00\n");
            }
        }
        else{
            System.out.println("Insufficient Balance.\n");
        }
    }

    public void deposit(){
        System.out.println("Enter amount you want to deposit :");
        float amount = scanner.nextFloat();

        if(amount <= 10000f){
            accountBalance += amount;
            transactions++;
            String str = amount + " Rs. Deposited.\n";
            transactionHistory = transactionHistory.concat(str);
            System.out.println("Successfully Deposited.\n");
        }
        else{
            System.out.println("Limit is 10000.00\n");
        }
    }

    public void transferMoney(){
        System.out.println("Enter Account number of Recipient : ");
        String accountNumber = scanner.next();

        System.out.println("Enter amount :");
        scanner.nextLine();
        float amount = scanner.nextFloat();

        if(accountBalance >= amount){
            if(amount <= 15000f){
                System.out.println("\nAmount transferred Successfully.\n");
                accountBalance -= amount;
                transactions++;
                String str = amount + " Rs. transferred to " + accountNumber + "\n";
                transactionHistory = transactionHistory.concat(str);
            }
            else{
                System.out.println("Limit is 15000.00.\n");
            }
        }
        else{
            System.out.println("Insufficient Balance.\n");
        }
    }

    public void checkBalance(){
        System.out.println("Rs. " + accountBalance + "\n");
    }

}
