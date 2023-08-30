package Lab5;

import java.util.Scanner;

public class ReadAndPrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("You entered the following numbers:");

        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
