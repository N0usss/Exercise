
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MainBankingSystem {

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem(null, 0);
        Scanner in = new Scanner(System.in);
        int menu =0;

        bank.setBalance(100000.50);


        System.out.println("----------WELCOME TO PERUSO BANK----------");
        System.out.println("---------User Information Section--------\n");

        System.out.print("Insert your username: ");
        bank.setName(in.next());

        System.out.println("\nWELCOME BACK "+ bank.getName().toUpperCase());

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        do{

            System.out.println("\n----------PERUSO BANK MAIN MENU----------");
            System.out.println("---------What do you want to do?---------\n");

            System.out.println("1: Check Balance");
            System.out.println("2: Deposit Money");
            System.out.println("3: Withdraw Money");
            System.out.println("0: Exit System");

            System.out.print("\nChoose option: ");
            menu = in.nextInt();


            if(menu == 1){


               System.out.println("\n----------CHECK BALANCE----------\n");
                System.out.println("\nYour remaining balance: " + bank.getBalance()+ "\n");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
            }

            if(menu == 2){

                    System.out.println("\n----------DEPOSIT MONEY----------\n");
                    System.out.print("Money to deposit: ");
                    double deposit = in.nextDouble();

                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }

                    bank.depositMoney(deposit);
                    System.out.println("Deposited successfully\n");

            }

            if (menu == 3){

                System.out.println("\n----------WITHDRAW MONEY----------\n");
                System.out.print("Money to withdraw: ");
                double withdraw = in.nextDouble();

                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }

                bank.withdrawMoney(withdraw);
            }


        }while(menu !=0);

        System.out.println("\nthank you for using our system");
        System.out.println("---------EXIT SYSTEM----------");
    }

}
