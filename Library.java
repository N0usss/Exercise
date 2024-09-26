import java.util.ArrayList;

public class Library {

    private ArrayList<Book> lib = new ArrayList<>();
    Book books = new Book(null,null,null);


    public void addBook(Book book){

        lib.add(book);

    }

    public void searchByTitle(String title){

        lib.contains("Harry Potter");
        lib.contains("Maze Runner");
        lib.contains("Wimpy Kids");
        lib.contains("Hunger Games");

        System.out.println(lib);

    }

    public void borrowBook(User user, String title){


            if(title.contains("Harry Potter")){

                books.setAvailable(false);
                user.borrowBook(title);
                System.out.println("Done Borrow");
            }
            else if(title.contains("Maze Runner")){

                books.setAvailable(false);
                user.borrowBook(title);
                System.out.println("Done Borrow");
            }
            else if(title.contains("Wimpy Kids")){

                books.setAvailable(false);
                user.borrowBook(title);
                System.out.println("Done Borrow");
            }
            else if(title.contains("Hunger Games")){

                books.setAvailable(false);
                user.borrowBook(title);
                System.out.println("Done Borrow");
            }
            else{
                System.out.println("Sorry, that book is not available for now.");
            }

        }


    public void PrintLibrary(){


        System.out.println(lib);
    }
}



