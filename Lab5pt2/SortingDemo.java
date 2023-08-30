package Lab5pt2;

import java.util.Arrays;
import java.util.Scanner;

    public class SortingDemo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();
            int[] array = new int[n];

            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            bubbleSort(array);

            System.out.println("Sorted array using Bubble Sort: " + Arrays.toString(array));

            System.out.print("Enter a number to search using Binary Search: ");
            int target = scanner.nextInt();

            int index = binarySearch(array, target);
            if (index != -1) {
                System.out.println(target + " found at index " + index);
            } else {
                System.out.println(target + " not found in the array.");
            }
        }

        public static void bubbleSort(int[] array) {
            int n = array.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }

        public static int binarySearch(int[] array, int target) {
            int left = 0;
            int right = array.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (array[mid] == target) {
                    return mid;
                } else if (array[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return -1;
        }
    }
