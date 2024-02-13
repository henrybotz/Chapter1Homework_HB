public class TextbookTester {
    public static void main(String[] args) {
        // Creating textbook objects
        Textbook textbook1 = new Textbook();
        // Using no-arg constructor
        Textbook textbook2 = new Textbook("Java Programming", "Dani Lopez", 2023);
        // Using parameterized constructor

        // Testing getters and setters
        System.out.println("Title of textbook1 before setting: " + textbook1.getTitle());
        textbook1.setTitle("Introduction to Algorithms");
        System.out.println("Title of textbook1 after setting: " + textbook1.getTitle());

        // Testing toString() method
        System.out.println("Details of textbook1: \n" + textbook1.toString());

        // Testing instance method
        System.out.println("Information about textbook2:");
        textbook2.printInfo();
    }
}
