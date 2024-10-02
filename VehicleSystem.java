import java.util.Scanner;

class Vehicle{

    private String make;
    private String model;
    private int year;
    private double rentalPricePerDay;


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }


    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setRentalPricePerDay(double rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }


    public double calculateRentalCost(int days){

       return rentalPricePerDay = rentalPricePerDay * days;

    }
}


class Car extends Vehicle{

    private int numSeats;
    private int numDoors;

    public int getNumSeats() {
        return numSeats;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public void displayCar(){

        System.out.println("\nMade by: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Seats: " + getNumSeats());
        System.out.println("Doors: " + getNumDoors());
        System.out.println("Rent per day: RM" + getRentalPricePerDay());
    }
}


class Motorcycle extends Vehicle{

    private int engineSize;

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public void displayMotor(){

        System.out.println("\nMade by: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Engine: " + getEngineSize());
        System.out.println("Rent per day: RM" + getRentalPricePerDay());

    }
}


public class VehicleSystem {

    public static void main(String[] args) {

        Car[] cars = new Car[2];
        Motorcycle[] motors = new Motorcycle[2];
        Scanner scan = new Scanner(System.in);

        String[] makeCar = {"Perodua", "Volkswagen"};
        String[] makeMotor = {"Kawasaki", "Yamaha"};

        String[] modelCar = {"Axia", "Polo"};
        String[] modelMotor = {"Ninja", "NVX"};

        int[] yearCar = {2015, 2017};
        int[] yearMotor = {2020, 2023};

        double[] rentalDayCar = {130.00, 180.50};
        double[] rentalDayMotor = {65.00, 55.50};

        int[] seats = {4, 2};
        int[] doors = {4, 2};

        int[] engine = {160, 155};


        for (int i = 0; i < makeCar.length; i++) {

            cars[i] = new Car();
            cars[i].setMake(makeCar[i]);
            cars[i].setModel(modelCar[i]);
            cars[i].setYear(yearCar[i]);
            cars[i].setRentalPricePerDay(rentalDayCar[i]);
            cars[i].setNumSeats(seats[i]);
            cars[i].setNumDoors(doors[i]);

            motors[i] = new Motorcycle();
            motors[i].setMake(makeMotor[i]);
            motors[i].setModel(modelMotor[i]);
            motors[i].setYear(yearMotor[i]);
            motors[i].setRentalPricePerDay(rentalDayMotor[i]);
            motors[i].setEngineSize(engine[i]);

        }

        System.out.println("----------VEHICLE RENTAL SYSTEM----------");
        System.out.println("----------------WELCOME------------------\n");
        System.out.println("What vehicle do you want to rent?\n");
        System.out.println("1: Car");
        System.out.println("2: Motorcycle\n");
        System.out.print("Pick option: ");
        int opt = scan.nextInt();

       if(opt==1) {


           String carSearch= "";
           boolean found = false;

           System.out.println("-\n---------LIST OF AVAILABLE CARS----------\n");

           for(int l=0; l<cars.length;l++){

               System.out.println(cars[l].getModel());
           }

           do {
               System.out.println("\nWhat car did you want to rent?\n");
               System.out.print("Car: ");
               carSearch= scan.next();


               for (int s = 0; s < cars.length; s++) {

                   if (carSearch.equalsIgnoreCase(cars[s].getModel())) {

                       System.out.println("Done renting");
                       cars[s].displayCar();
                       found = true;

                       System.out.println("How many days do you want to rent the cars?\n");
                       System.out.print("Days: ");
                       int days = scan.nextInt();
                       double totalRent = cars[s].calculateRentalCost(days);

                       System.out.println("Total payment for renting a car: RM" + totalRent);

                       break;

                   }
               }
               if (!found) {
                   System.out.println("That car is not in our list. Please pick based on the list");
               }

           }while (!found);


       }

       if(opt ==2){

           String motorSearch= "";
           boolean found = false;

           System.out.println("-\n---------LIST OF AVAILABLE MOTORS----------\n");

           for(int l=0; l<motors.length;l++){

               System.out.println(motors[l].getModel());
           }

           do {
               System.out.println("\nWhat motorcycle did you want to rent?\n");
               System.out.print("Motorcycle: ");
               motorSearch= scan.next();


               for (int s = 0; s < motors.length; s++) {

                   if (motorSearch.equalsIgnoreCase(motors[s].getModel())) {

                       System.out.println("Done renting");
                       motors[s].displayMotor();
                       found = true;

                       System.out.println("How many days do you want to rent the motorcycle?\n");
                       System.out.print("Days:");
                       int days = scan.nextInt();
                       double totalRent = motors[s].calculateRentalCost(days);


                       System.out.println("Total payment for renting a motorcycle: RM" + totalRent);
                       System.out.println();
                       break;

                   }
               }
               if (!found) {
                   System.out.println("That motorcycle is not in our list. Please pick based on the list");
               }

           }while (!found);

        }

       System.out.println("Thanks for renting, we will send the car to you immediately.");
       System.out.println("\n----------EXIT SYSTEM----------\n");
    }
}
