import java.util.ArrayList;

public class Library {

    private ArrayList<Book> lib = new ArrayList<>();
    Book books = new Book(null,null,null);


    public void addBook(Book book){

        lib.add(book);

    }

    public void searchByTitle(String title){

        boolean searching = false;

        for(int s=0;s<lib.size() && !searching;s++) {
            if((title.equalsIgnoreCase(lib.get(s).getTitle()))){
                System.out.println("The book is available in the library");
            }
            else {
                System.out.println("No information about this book");
            }
            searching=true;

        }

    }

    public void borrowBook(User user, String title){

        for (Book book : lib) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.GetIsAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Book '" + title + "' borrowed successfully by " + user.getName());
                }
                else {
                    user.removeBook(title);
                    System.out.println("Sorry, the book '" + title + "' is not available.");
                }
                return;
            }
        }


        System.out.println("Sorry, the book '" + title + "' is not available in the library.");
    }


}
