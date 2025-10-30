import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double currentBalance = 0.00d;

        boolean flag = false;

        while (flag != true) {

            System.out.println("Welcome to the Simple Console ATM");
            System.out.println("Please select an option:");

            String[] choice = {"1. Check Balance", "2. Deposit Funds", "3. Withdraw Funds", "4. Exit"};

            for (int i = 0; i < 4; i++) {
                System.out.println( choice[i] );
            }

            int option = sc.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Your current balance is " + currentBalance + " taka");
                    System.out.println();
                    break;

                case 2:
                    System.out.println("How much do you want to deposit?");
                    double deposit = sc.nextDouble();

                    currentBalance += deposit;
                    System.out.println("Your current balance is " + currentBalance + " taka");
                    System.out.println();
                    break;

                case 3:
                    System.out.println("How much do you want to withdraw?");
                    double withDraw = sc.nextDouble();

                    if (withDraw > currentBalance) {
                        System.out.println("Sorry your balance is insufficient");
                        System.out.println();
                    } else {

                        if (withDraw < 0) {
                            System.out.println("Invalid !!");
                            System.out.println();
                        } else if (withDraw > 100) {
                            System.out.println("You can withdraw maximum 100 taka!");
                            System.out.println();

                        } else {
                            currentBalance -= withDraw;
                            System.out.println("Your current balance is " + currentBalance + " taka");
                            System.out.println();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM! Goodbye ");
                    flag = true;
                    break;

                default:
                    System.out.println("Invalid option! Please select between 1 and 4.");
                    System.out.println();
                    break;

            }
        }
    }
}