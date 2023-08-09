package Lab3;

import java.util.Scanner;

public class Fact {
        public int num1, num2;
        public long factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }
        public int getSmaller() {
            return Math.min(num1, num2);
        }
        private void inputNumbers() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter First and Second number ");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
        }
        private void displayResults() {
            System.out.println("Factorial of " + num1 + ": " + factorial(num1));
            System.out.println("Factorial of " + num2 + ": " + factorial(num2));
            System.out.println("Smaller of " + num1 + " and " + num2 + ": " + getSmaller());
        }

        public static void main(String[] args) {
            Fact f = new Fact();
            f.inputNumbers();
            f.displayResults();
        }
    }

