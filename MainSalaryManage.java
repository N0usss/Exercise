import java.util.*;
import java.sql.*;
import  java.util.ArrayList;
import java.util.function.Predicate;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class MainSalaryManage {

    public static void main(String[] args){

        LocalDateTime nowDT = LocalDateTime.now();
        LocalDate nowD = LocalDate.now();
        LocalTime nowT = LocalTime.now();

        LocalDate BeginAugust = LocalDate.of(2024,8,1);
        LocalDate EndAugust = LocalDate.of(2024,8,30);


        SalaryManage[] salary = new SalaryManage[5];
        ArrayList<String> employee = new ArrayList<>();
        ArrayList<Double> base = new ArrayList<>();
        ArrayList<String> fav = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for(int i=0;i<5;i++){

            System.out.print("insert employee: ");
            employee.add(scan.next());
            System.out.print("insert base Salary: ");
            base.add(scan.nextDouble());

            salary[i] = new SalaryManage(employee.get(i),base.get(i));

            salary[i].setTransportAllowance(500.00);
            salary[i].setHealthAllowance(750.50);


        }

        System.out.println("___________________________________________");
        System.out.println("-- PAYSLIP GENERATED --");
        System.out.println(BeginAugust + " until " + EndAugust);
        System.out.println("___________________________________________");

        for(int j=0;j<employee.toArray().length;j++){



            if(salary[j].getBaseSalary()>10000){

               fav.add(salary[j].getName());

            }

            salary[j].Display();
            salary[j].Predication();
            System.out.println("---------------------------------------------------------");
        }

        System.out.println("Employee of the year: " );
        for(String favo:fav){

            System.out.println("- " + favo);

        }




       //double[] base = {100000,46000,23000,30000,50000};

        //String[] employee = {"Abu","Ya","Skibidi","Rizzler","Sigma"};

        /***try {
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
        }***/
    }


}
