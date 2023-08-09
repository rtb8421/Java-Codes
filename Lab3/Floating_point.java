package Lab3;

import java.util.Scanner;

public class Floating_point {
        public static class Calculator {
            public double num1;
            public double num2;

            public Calculator(double num1, double num2) {
                this.num1 = num1;
                this.num2 = num2;
            }

            public double getSum() {
                return num1 + num2;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter 1st and 2nd Floating point number: ");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();

            Calculator calculator = new Calculator(num1, num2);
            double sum = calculator.getSum();
            System.out.println("Sum of the two numbers: " + sum);

        }
    }
