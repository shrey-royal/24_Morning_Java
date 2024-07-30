class Book {
    private String title;
    private String author;
    private int yearPublished;

    {
        title = "book title";
        author = "book author";
        yearPublished = 0;

        //database connection
    }

    public Book() {}

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    void getDetails() {
        System.out.println("(" + title + ", " + author + ", " + yearPublished + ")");
    }
}


public class IIB2 {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.getDetails();

        b1 = new Book("1984", "George Orwell", 1949);
        b1.getDetails();
    }
}
