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

        for (Book book : lib) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.GetIsAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Book '" + title + "' borrowed successfully by " + user.getName());
                }
                else {
                   user.returnBook(title);
                    System.out.println("Sorry, the book '" + title + "' is not available.");
                }
                return;
            }
        }


        System.out.println("Sorry, the book '" + title + "' is not available in the library.");
    }


}
