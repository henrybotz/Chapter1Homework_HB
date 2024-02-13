import java.util.ArrayList;

public class BikeTester {
    public static void main(String[] args) {
        // Creating object bike1 using no-arg constructor
        Bike bike1 = new Bike();
        // Printing details of bike1
        System.out.println("Details of bike1 after creation:");
        System.out.println(bike1.toString());

        // Creating object bike2 using no-arg constructor and then changing its values using setters
        Bike bike2 = new Bike();
        // Using setter methods to change instance variable values
        bike2.setNumberOfWheels(3);
        bike2.setManufacturer("Trek");
        bike2.setYear(2018);
        // Printing details of bike2
        System.out.println("Details of bike2 after setting values:");
        System.out.println(bike2.toString());

        // Creating an ArrayList of bikes called bikeList
        ArrayList<Bike> bikeList = new ArrayList<>();
        // Adding bike1 and bike2 to bikeList
        bikeList.add(bike1);
        bikeList.add(bike2);

        // Printing bikeList
        System.out.println("\nContents of bikeList:");
        for (Bike bike : bikeList) {
            System.out.println(bike.toString());
        }

        // Counting the total number of wheels on all bikes in bikeList
        int totalWheels = 0;
        for (Bike bike : bikeList) {
            totalWheels += bike.getNumberOfWheels();
        }
        // Printing the total number of wheels
        System.out.println("\nTotal number of wheels on all bikes: " + totalWheels);

        // Finding the year of the oldest bike in bikeList
        int oldestYear = bikeList.get(0).getYear();
        for (Bike bike : bikeList) {
            if (bike.getYear() < oldestYear) {
                oldestYear = bike.getYear();
            }
        }
        // Printing the year of the oldest bike
        System.out.println("Year of the oldest bike: " + oldestYear);
    }

}
