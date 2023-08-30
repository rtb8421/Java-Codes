package Lab5;

public class LeastNumberAfterDeletingDigits {
    public static void main(String[] args) {
        String inputNumber = "36945";
        int k = 3;
        String leastNumber = findLeastNumberAfterDeletingDigits(inputNumber, k);
        System.out.println("Least Number: " + leastNumber);
    }

    private static String findLeastNumberAfterDeletingDigits(String number, int k) {
        StringBuilder result = new StringBuilder();
        int remainingDigits = number.length() - k;
        char[] digits = number.toCharArray();

        int startIndex = 0;
        for (int i = 0; i < remainingDigits; i++) {
            int minIndex = startIndex;
            for (int j = startIndex; j <= digits.length - remainingDigits + i; j++) {
                if (digits[j] < digits[minIndex]) {
                    minIndex = j;
                }
            }
            result.append(digits[minIndex]);
            startIndex = minIndex + 1;
        }
        return result.toString();
    }
}

