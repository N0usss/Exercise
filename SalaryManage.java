import java.util.*;
import java.sql.*;
import  java.util.ArrayList;
import java.util.function.Predicate;



public class SalaryManage {

    private String name;
    private double baseSalary;
    private double healthAllowance;
    private double transportAllowance;
    private double bonus;
    private double totalSalary;

    //Get-----------------------------------------------------------------------

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getHealthAllowance() {
        return healthAllowance;
    }

    public double getTransportAllowance() {
        return transportAllowance;
    }
    public double getBonus() {
        return bonus;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    //Set------------------------------------------------------------------------------

    public void setName(String name) {
        this.name = name;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setHealthAllowance(double healthAllowance) {
        this.healthAllowance = healthAllowance;
    }

    public void setTransportAllowance(double transportAllowance) {
        this.transportAllowance = transportAllowance;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    //Construct------------------------------------------------------------------------------

    public SalaryManage(String Name, double BaseSalary){

        this.name = Name;
        this.baseSalary = BaseSalary;
        this.healthAllowance = 0;
        this.transportAllowance = 0;
        this.bonus = 0;

    }

    //Method------------------------------------------------------------------------------

    public double calculateTotalSalary(){

        totalSalary = baseSalary + healthAllowance + transportAllowance + assignBonus();

        return(totalSalary);
    }

    public double assignBonus(){

        if(baseSalary>50000){

            bonus = 0.1 * baseSalary;
        }
        if(baseSalary>=30000 && baseSalary<=50000){

            bonus = 0.05 * baseSalary;
        }
        if(baseSalary<30000){

            bonus = 0;
        }

        return(bonus);

    }

    public void Display(){

        double allowance = healthAllowance + transportAllowance;

        System.out.println("Name: "+ name);
        System.out.println("Salary: " + baseSalary);
        System.out.println("Allowance given: " + allowance);
        System.out.println("Bonus: " + assignBonus());
        System.out.println("Total Salary: " + calculateTotalSalary());


    }

    public void Predication(){



        Predicate<Double> isGreat = (salaries) -> salaries > 10000;

        if(isGreat.test(baseSalary)){

            System.out.println(":)");
        }
        else {
            System.out.println(":(");
        }

    }

}
