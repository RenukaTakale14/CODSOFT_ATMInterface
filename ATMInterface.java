import java.util.Scanner;

public class ATMInterface {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount(10000.00);

        ATM atm = new ATM(account, scanner);

        atm.start();

        scanner.close();
    }
}