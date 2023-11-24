package Internship;

import java.util.*;

public class Task3 {
    public static class ATM {
        int balance = 0;

        ATM() {
            boolean process = true;
            while (process) {
                Scanner sc = new Scanner(System.in);
                System.out.println("1.Deposit \n2.Withdraw \n3.checkbalance");
                System.out.print("Enter the number to perform the action:");
                int action = sc.nextInt();
                if (action == 1) {
                    System.out.print("\nEnter the amount to be deposited:");
                    int amount = sc.nextInt();
                    Deposit(amount);
                } else if (action == 2) {
                    System.out.print("\nEnter the amount to Withdraw:");
                    int amount = sc.nextInt();
                    Withdraw(amount);
                } else if (action == 3) {
                    System.out.println("Your balance is: "+checkbalance());
                } else {
                    System.out.println("Error");
                }
                System.out.println("\nDo you want to perofrm any other actions?");
                System.out.println("if yes type true , To end session type false");
                process = sc.nextBoolean();
            }

        }

        private int checkbalance() {
            return this.balance;
        }

        private int Deposit(int amount) {
            this.balance = this.balance + amount;
            System.out.println("Amount deposited");
            return this.balance;
        }

        private int Withdraw(int amount) {
            if (this.balance < amount) {
                System.out.println("Insufficient Funds");
                return -1;
            }
            this.balance = this.balance - amount;
            System.out.println("Amount debited");
            return this.balance;
        }
    }


    public static void main(String[] args) {
        ATM umesh = new ATM();
    }
}
