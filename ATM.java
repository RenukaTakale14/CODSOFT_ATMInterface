import java.util.Scanner;

public class ATM {

    private final BankAccount account;
    private final Scanner scanner;

    public ATM(BankAccount account, Scanner scanner) {

        this.account = account;
        this.scanner = scanner;
    }

    public void start() {

        boolean running = true;

        System.out.println();
        System.out.println("==============================================");
        System.out.println("               WELCOME TO ATM");
        System.out.println("==============================================");

        while (running) {

            displayMenu();

            int choice = readMenuChoice();

            switch (choice) {

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
                    running = false;
                    System.out.println(
                            "\nThank you for using our ATM."
                    );
                    break;

                default:
                    System.out.println(
                            "Invalid option. Please choose 1-4."
                    );
            }
        }
    }

    private void displayMenu() {

        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        System.out.println("----------------------------------------------");
    }

    private int readMenuChoice() {

        while (true) {

            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {

                int choice = scanner.nextInt();

                if (choice >= 1 && choice <= 4) {
                    return choice;
                }
            } else {
                scanner.next();
            }

            System.out.println(
                    "Invalid choice. Please enter a number from 1 to 4."
            );
        }
    }

    private void checkBalance() {

        System.out.printf(
                "Current Balance: ₹%.2f%n",
                account.getBalance()
        );
    }

    private void withdrawMoney() {

        double amount = readAmount(
                "Enter amount to withdraw: "
        );

        if (account.withdraw(amount)) {

            System.out.printf(
                    "₹%.2f withdrawn successfully.%n",
                    amount
            );

            System.out.printf(
                    "Remaining Balance: ₹%.2f%n",
                    account.getBalance()
            );

        } else {

            System.out.println(
                    "Transaction failed. Insufficient balance or invalid amount."
            );
        }
    }

    private void depositMoney() {

        double amount = readAmount(
                "Enter amount to deposit: "
        );

        if (account.deposit(amount)) {

            System.out.printf(
                    "₹%.2f deposited successfully.%n",
                    amount
            );

            System.out.printf(
                    "Updated Balance: ₹%.2f%n",
                    account.getBalance()
            );

        } else {

            System.out.println(
                    "Transaction failed. Deposit amount must be greater than zero."
            );
        }
    }

    private double readAmount(String message) {

        while (true) {

            System.out.print(message);

            if (scanner.hasNextDouble()) {

                double amount = scanner.nextDouble();

                if (amount > 0) {
                    return amount;
                }

                System.out.println(
                        "Amount must be greater than zero."
                );

            } else {

                System.out.println(
                        "Invalid input. Please enter a valid amount."
                );

                scanner.next();
            }
        }
    }
}