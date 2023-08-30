package Lab5;

import java.util.Arrays;

public class Find3rdLargest {
    public static void main(String[] args) {
        int[] numbers = { 15, 30, 10, 25, 5, 20, 35, 40, 45, 50 };
        int thirdLargest = findThirdLargest(numbers);
        System.out.println("Third largest number: " + thirdLargest);
    }

    public static int findThirdLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 3];
    }
}
