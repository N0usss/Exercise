import java.util.ArrayList;
import java.util.Scanner;

public class MainLibrarySystem {

    public static void main(String[] args){

        Book[] books = new Book[10];
        User[] users = new User[2];
        Library Lib = new Library();
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\\n");

        String[] titles= {"Harry Potter", "Maze Runner", "Wimpy Kids", "Hunger Games"};
        String[] authors= {"JK Rowling", "James Dashner", "Jeff Kinney", "Suzanne Collins"};
        String[] Isbn = {"192749", "309273", "810222", "128742"};

        for (int i = 0; i < titles.length; i++) {
            books[i] = new Book(titles[i], authors[i], Isbn[i]);
            Lib.addBook(books[i]);  // Add books to the library's list
        }

        for (int s=0;s<2;s++){

            users[s] = new User();

            System.out.print("Name: ");
            users[s].setName(scan.next());
            System.out.print("Age: ");
            users[s].setAge(scan.nextInt());
            System.out.print("Books to borrow: ");
            String bookToBorrow = scan.next();

            users[s].borrowBook(bookToBorrow);

            Lib.borrowBook(users[s], bookToBorrow);


        }

        scan.close();






       System.out.println("--Available books--");
        for(int a=0;a<titles.length;a++){
            books[a].printBookInfo();

        }

        System.out.println("--Books borrowed--");

        for(User user: users){
            user.printBorrowedBooks();
        }

        System.out.println("--Overdue Books--");
        for(User user: users){
            user.checkDueDates();
        }


    }

}

