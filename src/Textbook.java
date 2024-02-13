public class Textbook {
    // Instance variables
    private String title;
    private String author;
    private int yearPublished;

    // Constructors
    // No-argument constructor
    public Textbook() {
        // Default values
        this.title = "Untitled";
        this.author = "Unknown";
        this.yearPublished = 0;
    }

    // Constructor with parameters
    public Textbook(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    // toString() method
    @Override
    public String toString() {
        return "Textbook Details: \n" +
                "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Year Published: " + yearPublished + "\n";
    }

    // Instance method
    public void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
    }
}
