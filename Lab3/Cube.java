package Lab3;

public class Cube {
    public static void main(String[] args) {
        double number1 = 3;
        double number2 = 0.2;

        double result1 = cube(number1);
        double result2 = cube(number2);

        System.out.println("Cube of " + number1 + " is: " + result1);
        System.out.println("Cube of " + number2 + " is: " + result2);
    }

    public static double cube(double number) {
        return Math.pow(number, 3);
    }
}
