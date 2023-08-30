package Lab5pt2;

import java.util.Scanner;

    public class CompareStringsDemo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first string: ");
            String str1 = scanner.nextLine();

            System.out.print("Enter the second string: ");
            String str2 = scanner.nextLine();

            int comparison = str1.compareTo(str2);

            if (comparison < 0) {
                System.out.println("1");
            } else if (comparison > 0) {
                System.out.println("2");
            } else {
                System.out.println("0");
            }
        }
    }

