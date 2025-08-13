
import java.util.Scanner;

public class ATM_Machine {

    public static void main(String[] args) {

        System.out.println("-------ATM------");
        float balance = 2000;
        Scanner sc = new Scanner(System.in);
        int i = 0;

        while (i < 3) {
            System.out.println("\nEnter the pin ");
            int pin = sc.nextInt();
            if (pin == 1234) {
                while (true) {
                    System.out.println("\n1.Withdrawing");
                    System.out.println("2.Depositing");
                    System.out.println("3.Check Balance");
                    System.out.println("4.Exit");
                    System.out.print("Enter your choice = ");
                    int choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.print("Enter the amount = ");
                            float amount_W = sc.nextFloat();
                            balance = withdrawing(balance, amount_W);
                            break;
                        case 2:
                            System.out.print("Enter the amount = ");
                            float amount_D = sc.nextFloat();
                            balance = depositing(balance, amount_D);
                            break;
                        case 3:
                            System.out.println("Current balance: " + balance);
                            break;
                        case 4:
                            System.out.println("Thank you for using the ATM!");
                            sc.close();
                            return;
                        default:
                            System.out.println("Invalid choice! Please try again.");
                    }
                }
            } else {
                System.out.println("Invalid Pin! Try Again");
            }

            i++;
        }
    }

    public static float withdrawing(float balance, float amount_W) {
        if (amount_W > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount_W;
            System.out.println("Please collect your cash.");
            System.out.println("Remaining balance: " + balance);
        }
        return balance;
    }

    public static float depositing(float balance, float amount_D) {
        if (amount_D <= 0) {
            System.out.println("Invalid deposit amount!");
        } else {
            balance += amount_D;
            System.out.println("Amount deposited successfully.");
            System.out.println("Updated balance: " + balance);
        }
        return balance;
    }
}
