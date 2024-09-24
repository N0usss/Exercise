import java.util.*;
import java.sql.*;
public class MainSalaryManage {

    public static void main(String[] args){


        SalaryManage[] salary = new SalaryManage[5];

       double[] base = {100000,46000,23000,30000,50000};

        String[] employee = {"Abu","Ya","Skibidi","Rizzler","Sigma"};

        try {
            for (int i = 0; i < employee.length; i++) {

                salary[i] = new SalaryManage(employee[i], base[i]);

                salary[i].setHealthAllowance(500.0);
                salary[i].setTransportAllowance(350.0);

                double allowance = salary[i].getHealthAllowance() + salary[i].getTransportAllowance();


                System.out.println("Employee " + i);
                System.out.println("Name: " + salary[i].getName());
                System.out.println("Base Salary: " + salary[i].getBaseSalary());
                System.out.println("Allowance: " + allowance);
                System.out.println("Bonus: " + salary[i].assignBonus());
                System.out.println("Total Salary: " + salary[i].calculateTotalSalary());
                System.out.println("----------------------------------------------------------------------");
            }
        }
        catch (Exception e){
            System.out.println("caught bad " + e.getMessage());
        }
        finally {
            System.out.println("welp continue i guess");
        }
    }


}
