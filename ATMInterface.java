package com.company;
import java.util.*;

public class ATMInterface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM obj = new ATM();
        System.out.println("----------------------- WELCOME TO ATM ------------------------");
        System.out.println("\nPlease enter your card\n");

        boolean isValid = obj.login();
        if(isValid){
            boolean flag = false;
            while (!flag){

                System.out.println("Enter your choice : ");
                System.out.println("1. Transactions History");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Deposit Money");
                System.out.println("4. Transfer");
                System.out.println("5. Check Balance");
                System.out.println("6. Exit");

                int option = scanner.nextInt();

                switch(option){
                    case 1:
                        obj.transactionHistory();
                        break;
                    case 2:
                        obj.withdraw();
                        break;
                    case 3:
                        obj.deposit();
                        break;
                    case 4:
                        obj.transferMoney();
                        break;
                    case 5:
                        obj.checkBalance();
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("Please enter a valid choice");
                }
            }
        }
    }
}
