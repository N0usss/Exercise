import java.util.ArrayList;
import java.util.Scanner;

public class MainLibrarySystem {

    public static void main(String... arg) {

        Book[] books = new Book[10];
        ArrayList<User> users = new ArrayList<>();
        Library Lib = new Library();
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\\n");
        int option = 0;

        String[] titles = {"Harry Potter", "Maze Runner", "Wimpy Kids", "Hunger Games"};
        String[] authors = {"JK Rowling", "James Dashner", "Jeff Kinney", "Suzanne Collins"};
        String[] Isbn = {"192749", "309273", "810222", "128742"};

        for (int i = 0; i < titles.length; i++) {
            books[i] = new Book(titles[i], authors[i], Isbn[i]);
            Lib.addBook(books[i]);  // Add books to the library's list
        }


        System.out.println("----------ADMIN LIBRARY SYSTEM----------");
        System.out.println("----------Customer Information----------\n");
        System.out.println("Please insert customer information here---");

        for (int s = 0; s < 3; s++) {

            User user = new User();

            System.out.print("Name: ");
            user.setName(scan.next());
            System.out.print("Age: ");
            user.setAge(scan.nextInt());

            users.add(user);


        }

        do {

            System.out.println("\n---------Main Menu----------\n");

            System.out.println("1: Search Books");
            System.out.println("2: Customer Borrow Books");
            System.out.println("9: Exit Main Menu");

            System.out.print("Choose menu: ");
            option = scan.nextInt();

            if (option == 1) {
                System.out.println("\n----------Books to search----------\n");
                String search = scan.next();
                Lib.searchByTitle(search);
            }


            if (option == 2) {
                System.out.println("----------Available books to borrow------\n");
                for (int a = 0; a < titles.length; a++) {
                    books[a].printBookInfo();

                }

                for (int b = 0; b < users.size(); b++) {

                    System.out.print("\nBooks to borrow by " + users.get(b).getName() + ":");
                    String bookToBorrow = scan.next();

                    users.get(b).borrowBook(bookToBorrow);

                    Lib.borrowBook(users.get(b), bookToBorrow);

                }


                System.out.println("----------Available books after borrow----------\n");
                for (int a = 0; a < titles.length; a++) {
                    books[a].printBookInfo();

                }


                System.out.println("\n----------Books borrowed----------\n");

                for (User user : users) {
                    user.printBorrowedBooks();
                }

                System.out.println("\n----------Overdue Books----------\n");
                for (int u = 0; u < users.size(); u++) {
                    users.get(u).checkDueDates();
                }
            }



        }while(option !=9);

        System.out.println("\n---Thank you for using the system---\n");
        System.out.println("----------EXIT APPLICATION----------");

    }

}

