public class BankingSystem {

    private String name;
    private double balance;

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankingSystem(String name, double balance){

        this.name = name;
        this.balance = balance;
    }

    public void depositMoney(double deposit){


        deposit = balance + deposit;
        balance = deposit;


    }

    public void withdrawMoney(double withdraw){

        if(withdraw<=balance){
            withdraw = balance - withdraw;
            balance = withdraw;
            System.out.println("Withdraw successfully");
        }
        else{
            System.out.println("Cannot withdraw more than that.");
        }
    }

}
