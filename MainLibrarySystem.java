import java.util.ArrayList;
import java.util.Scanner;

public class MainLibrarySystem {

    public static void main(String[] args){

        Book[] books = new Book[10];
        User[] users = new User[2];
        Library Lib = new Library();
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\\n");


        for (int s=0;s<2;s++){

            User user = new User();

            System.out.print("Name: ");
            user.setName(scan.next());
            System.out.print("Age: ");
            user.setAge(scan.nextInt());
            System.out.print("Books to borrow: ");
            String bookToBorrow = scan.next();

            user.borrowBook(bookToBorrow);

            Lib.borrowBook(user, bookToBorrow);

            users[s] = user;

        }

        scan.close();

        String[] titles= {"Harry Potter", "Maze Runner", "Wimpy Kids", "Hunger Games"};
        String[] authors= {"JK Rowling", "James Dashner", "Jeff Kinney", "Suzanne Collins"};
        String[] Isbn = {"192749", "309273", "810222", "128742"};

        for(int row=0;row<titles.length;row++){


           books[row] = new Book(titles[row],authors[row],Isbn[row]);

            books[row].setTitle(titles[row]);
            books[row].setAuthor(authors[row]);
            books[row].setIsbn(Isbn[row]);



        }



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

        System.out.println("Books that borrowed");
        Lib.PrintLibrary();


    }

}

