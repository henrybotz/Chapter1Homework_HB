    public class PersonTester {
        public static void main(String[] args) {


            // Creating a Person object using no-argument constructor
            Person person1 = new Person();
            System.out.println("Person1 details before name change:");
            System.out.println(person1.toString());
            person1.talk();

            // Setting/changing the name of person1
            person1.setName("Howard Roark");

            // Invoking the talk() method on person1
            System.out.println("\nPerson1 details after name change:");
            System.out.println(person1.toString());
            person1.talk();
        }
    }
