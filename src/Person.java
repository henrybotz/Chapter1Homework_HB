public class Person {

        // Instance variables
        private String name;
        private int age;
        private String eyeColor;

        // No-argument constructor
        public Person() {
            // Initialize instance variables with default values
            this.name = "Nick Lopez";
            this.age = 0;
            this.eyeColor = "Unknown";
        }

        // 3-argument constructor
        public Person(String name, int age, String eyeColor) {
            // Initialize instance variables with passed parameters
            this.name = name;
            this.age = age;
            this.eyeColor = eyeColor;
        }

        // Getters
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getEyeColor() {
            return eyeColor;
        }

        // Setters
        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setEyeColor(String eyeColor) {
            this.eyeColor = eyeColor;
        }

        // toString() method override
        @Override
        public String toString() {
            return "Person Details: \n" +
                    "Name: " + name + "\n" +
                    "Age: " + age + "\n" +
                    "Eye Color: " + eyeColor + "\n";
        }

        // Instance method talk()
        public void talk() {
            System.out.println("Welcome, coders! I am " + name);
        }

        public static void main(String[] args) {
            // Creating a Person object using no-argument constructor
            Person person1 = new Person();
            System.out.println(person1.toString());
            person1.talk();

            // Creating a Person object using 3-argument constructor
            Person person2 = new Person("Henry Botz", 22, "Brown");
            System.out.println(person2.toString());
            person2.talk();
        }
    }

