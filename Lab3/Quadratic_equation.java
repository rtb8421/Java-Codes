package Lab3;

import java.util.Scanner;

public class Quadratic_equation {
        public double a, b, c;
        public void read() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a, b, and c values: ");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();
        }

        public double getDiscriminant() {
            return b * b - 4 * a * c;
        }

        public void getRoots() {
            double discriminant = getDiscriminant();

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Roots are real and distinct.");
                System.out.println("Root 1: " + root1);
                System.out.println("Root 2: " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("Roots are real and equal.");
                System.out.println("Root: " + root);
            } else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                System.out.println("Roots are imaginary.");
                System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
                System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
            }
        }

        public static void main(String[] args) {
            Quadratic_equation solver = new Quadratic_equation();
            solver.read();
            solver.getRoots();
        }
    }


