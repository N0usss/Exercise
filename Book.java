public class Book {

    String title;
    String author;
    String isbn;
    boolean isAvailable = true;

    //Get------------------------------------------------------------------


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean GetIsAvailable() {
        return isAvailable;
    }

   // Set---------------------------------------------------------------


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Book(String title, String author, String isbn){

        this.title = title;
        this.author = author;
        this.isbn = isbn;

    }

    public void printBookInfo(){

        System.out.println("Title: " + title + ", " + "Author: " + author +", " + "ISBN: " + isbn + ", " + "Available: " + isAvailable);


    }
}
