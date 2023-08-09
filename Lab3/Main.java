package Lab3;
import java.util.*;
    class PrimeChecker {
        public static boolean isPrime(int number) {
            if (number <= 1)
                return false;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0)
                    return false;
            }
            return true;
        }
    }
    class LeapYearChecker {
        public static boolean isLeapYear(int year) {
            if (year % 4 != 0)
                return false;
            else if (year % 100 != 0)
                return true;
            else if (year % 400 != 0)
                return false;
            return true;
        }
    }
    class DigitPrinter {
        public static void printDigits(int number) {
            if (number >= 100 && number <= 999) {
                int digit1 = number / 100;
                int digit2 = (number / 10) % 10;
                int digit3 = number % 10;
                System.out.println("Digit 1: " + digit1);
                System.out.println("Digit 2: " + digit2);
                System.out.println("Digit 3: " + digit3);
            } else {
                System.out.println("Invalid input! Enter a 3-digit number.");
            }
        }
    }
    class BinaryConverter {
        public static String decimalToBinary(int decimal) {
            return Integer.toBinaryString(decimal);
        }

        public static int binaryToDecimal(String binary) {
            return Integer.parseInt(binary, 2);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number to check if it is prime: ");
            int num1 = scanner.nextInt();
            if (PrimeChecker.isPrime(num1))
                System.out.println(num1 + " is a prime number.");
            else
                System.out.println(num1 + " is not a prime number.");

            System.out.print("Enter a year to check if it is a leap year: ");
            int year = scanner.nextInt();
            if (LeapYearChecker.isLeapYear(year))
                System.out.println(year + " is a leap year.");
            else
                System.out.println(year + " is not a leap year.");

            System.out.print("Enter a 3-digit number: ");
            int num2 = scanner.nextInt();
            DigitPrinter.printDigits(num2);

            System.out.print("Enter a decimal number and binary number ");
            int decimalNumber = scanner.nextInt();
            String binaryNumber = scanner.next();
            String binaryString = BinaryConverter.decimalToBinary(decimalNumber);
            System.out.println("Binary representation: " + binaryString);
            int decimalResult = BinaryConverter.binaryToDecimal(binaryNumber);
            System.out.println("Decimal representation: " + decimalResult);
        }
    }

