package Lab4pt2;

    class Person {
        String name;
        int age;

        // Constructor with parameters
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to display person details
        void display() {
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
        }

        // Method to return the current object using 'this' keyword
        Person getPerson() {
            return this;
        }
    }

    public class ThisKeywordExample {
        public static void main(String[] args) {
            Person person1 = new Person("John", 30);
            Person person2 = new Person("Jane", 25);

            System.out.println("Person 1 Details:");
            person1.display();

            System.out.println("\nPerson 2 Details:");
            person2.display();

            // Using 'this' as a return statement
            Person returnedPerson = person1.getPerson();
            System.out.println("\nReturned Person Details:");
            returnedPerson.display();

            // Checking if the returned person is the same object as person1
            System.out.println("\nAre person1 and returnedPerson the same object? " + (person1 == returnedPerson));
        }
    }

