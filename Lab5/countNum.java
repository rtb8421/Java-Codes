package Lab5;

public class countNum{
    public static void main(String[] args) {
        int[] numbers = { 2, 12, 10, 11, 5, 15, 18, 16 };
        int evenCount = 0;

        for (int i=0; i<=numbers.length; i++) {
            if (i % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Number of even numbers: " + evenCount);
    }
}
