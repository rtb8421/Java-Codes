package Lab2;

public class Qs7 {
    public static void main(String[] args) {
        int upperBound = 100;
        int sum = 0;

        for (int i = 1; i <= upperBound; i++) {
            sum += i;
        }

        double average = (double) sum / upperBound;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

    }
}
