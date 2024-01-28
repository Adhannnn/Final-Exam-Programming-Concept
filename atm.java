package atm;
import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amount = 1000;

        System.out.println("\nPlease input your PIN ");
        System.out.print("PIN : ");
        int pin = input.nextInt();

        while (true) {
            System.out.println("\nWelcome, what are do you want today ? : ");

            String[] option = { "Withdraw", "Deposit", "Check Balance", "Exit" };

            int i = 0;
            while (i < option.length) {
                System.out.println((i + 1) + ". " + option[i]);
                i++;
            }

            System.out.print("Choose : ");
            int optionn = input.nextInt();

            if (optionn < 1 || optionn > 4) {
                System.out.print("Choose again : ");
                optionn = input.nextInt();
            }

            if (optionn == 1) {
                System.out.println("\nYour balance account : " + amount + " USD");
                System.out.println("How much do you want ? ");
                double withdraw = input.nextDouble();

                if (withdraw > amount) {
                    System.out.println("\nInsufficient amount");
                    System.out.println("Your balance account : " + amount + " USD");
                    continue;
                }

                else {
                    amount -= withdraw;
                    System.out.println("\nYour withdraw succesfully");
                    System.out.println("Your balance account : " + amount + " USD");
                    continue;
                }
            }

            else if (optionn == 2) {
                System.out.println("\nYour balance account : " + amount + " USD");
                System.out.println("How much do you want ? ");
                double deposit = input.nextDouble();

                amount += deposit;

                System.out.println("\nYour deposit succesfully");
                System.out.println("Your balance account : " + amount + " USD");
            }

            else if (optionn == 3) {
                System.out.println("\nYour balance account : " + amount + " USD");
            }

            else {
                break;
            }
        }
        System.out.println("\nThank you");
        input.close();
    }
}
