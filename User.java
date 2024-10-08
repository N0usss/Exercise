import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.LocalDate;

import java.util.HashMap;
import java.util.Map;


public class User {

    private String name;
    private int age;
    private ArrayList<String> borrowedBooks = new ArrayList<>();
    private ArrayList<LocalDate> dates = new ArrayList<>();
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMMM-yyyy ");
    LocalDate now = LocalDate.now();
    String dateNow = format.format(now);
    LocalDate dueDate = LocalDate.now().plusDays(14);
    String dateForDue = format.format(dueDate);
    Period endBorrow = Period.between(now,dueDate);

    //GET--------------------------------------------------------------

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<String> getBorrowedBooks() {
        return borrowedBooks;
    }

    //SET--------------------------------------------------------------


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBorrowedBooks(ArrayList<String> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

//METHOD-----------------------------------------------------------

    public void borrowBook(String bookTitle){

        borrowedBooks.add(bookTitle);
       // dates.add(now);

    }

    public void removeBook(String bookTitle){

        borrowedBooks.remove(bookTitle);

    }

    public void printBorrowedBooks() {

        System.out.print("User: " + name + ", " );
        System.out.println("Borrowed: " + String.join(", ", borrowedBooks));

        }

    public void checkDueDates(){

        if(!borrowedBooks.isEmpty()) {

            System.out.print("User: " + name +", ");
            System.out.print("Books: " +String.join(", ", borrowedBooks) + ", ");
            System.out.println("Date borrowed: " + dateNow + ", " + "Date for overdue: " + dateForDue);
            System.out.println("Overdue by " + endBorrow + " days");
        }
        else {

            System.out.print("User: " + name +", ");
            System.out.println("No due date");
        }

    }
    }




