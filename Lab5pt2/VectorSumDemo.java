package Lab5pt2;

    import java.util.Scanner;
import java.util.Vector;

    public class VectorSumDemo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Vector<Integer> numbers = new Vector<>();

            System.out.println("Enter 5 integers:");
            for (int i = 0; i < 5; i++) {
                int num = scanner.nextInt();
                numbers.add(num);
            }

            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }

            System.out.println("Sum of the numbers: " + sum);
        }
}
