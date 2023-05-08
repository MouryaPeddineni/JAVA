package com.company;
import java.util.*;

public class ATMInterface {

    Scanner sc = new Scanner(System.in);

    float balance;
    int PIN = 1234;

    public void checkpin() {
        System.out.println("Enter your 4-digit ATM pin : ");
        int enteredPin = sc.nextInt();
        if(enteredPin==PIN){
            menu();
        }
        else{
            while(true){
                System.out.println("Enter a valid pin");
                enteredPin = sc.nextInt();
                if(enteredPin==PIN){
                    menu();
                    break;
                }
            }
        }
    }

    public void menu(){
        while (true){
            System.out.println("Enter your choice : ");
            System.out.println("1. Check A/C Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");

            int option = sc.nextInt();

            switch(option){
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Please enter a valid choice");
            }
        }
    }

    public void checkBalance(){
        System.out.println("Your Account Balance is :" + balance);
    }

    public void withdrawMoney(){
        System.out.println("Enter the amount you want to withdraw :");
        float amt = sc.nextFloat();
        if(amt<=balance){
            balance = balance - amt;
            System.out.println("Your Money withdrawl is successful. Your remaining account balance is :"+balance);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

    public void depositMoney(){
        System.out.println("Enter the amount you want to deposit : ");
        float amt = sc.nextFloat();
        balance = balance + amt;
        System.out.println("Your Money Deposited Successfully. Your account balance is :"+balance);
    }

}
