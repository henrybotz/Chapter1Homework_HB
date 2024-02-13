public class Bike {
    // Instance variables
    private int numberOfWheels;
    private String manufacturer;
    private int year;


    // No-argument constructor
    public Bike() {
        // Initialize instance variables with default values
        this.numberOfWheels = 2;
        this.manufacturer = "Schwinn";
        this.year = 2014;

    }

    // Constructor with all parameters
    public Bike(int numberOfWheels, String manufacturer, int year) {
        // Initialize instance variables
        this.numberOfWheels = numberOfWheels;
        this.manufacturer = manufacturer;
        this.year = year;

    }

    // Getters
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    // Setters
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // toString() method override
    @Override
    public String toString() {
        return "Bike Details: \n" +
                "Number of Wheels: " + numberOfWheels + "\n" +
                "Manufacturer: " + manufacturer + "\n" +
                "Year: " + year + "\n";
    }

    public static void main(String[] args) {
        // Creating a Bike object using no-argument constructor
        Bike bike1 = new Bike();
        System.out.println(bike1.toString());

        // Creating a Bike object using 3-argument constructor
        Bike bike2 = new Bike(2, "Giant", 2020);
        System.out.println(bike2.toString());
    }
}
