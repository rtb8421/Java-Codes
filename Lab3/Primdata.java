package Lab3;

public class Primdata {
        private byte byteVar;
        private short shortVar;
        private int intVar;
        private long longVar;
        private float floatVar;
        private double doubleVar;
        private char charVar;
        private boolean booleanVar;

        // Method to print the default values
        public void getEmployeeDetails() {
            System.out.println(byteVar);
            System.out.println(shortVar);
            System.out.println(intVar);
            System.out.println(longVar);
            System.out.println(floatVar);
            System.out.println(doubleVar);
            System.out.println(charVar);
            System.out.println(booleanVar);
        }
        public void getCollegeDetails() {
            System.out.println("RTB");
        }

        public static void main(String[] args) {
            Primdata emp = new Primdata();
            emp.getEmployeeDetails();
            emp.getCollegeDetails();
        }
    }
