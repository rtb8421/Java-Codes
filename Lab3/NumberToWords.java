package Lab3;

import java.util.Scanner;

    public class NumberToWords {
        public static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        public static final String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        public static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        public static String numberToWords(int number) {
            if (number == 0) {
                return "Zero";
            }
            return convertNumberToWords(number);
        }

        public static String convertNumberToWords(int number) {
            if (number < 10) {
                return units[number];
            } else if (number < 20) {
                return teens[number - 10];
            } else if (number < 100) {
                return tens[number / 10] + " " + units[number % 10];
            } else if (number < 1000) {
                return units[number / 100] + " Hundred " + convertNumberToWords(number % 100);
            } else {
                return "Number out of range (1 to 999)";
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number (1 to 999): ");
            int number = scanner.nextInt();

            if (number >= 1 && number <= 999) {
                String words = numberToWords(number);
                System.out.println("Number in words: " + words);
            } else {
                System.out.println("Number out of range (1 to 999)");
            }
        }
    }

