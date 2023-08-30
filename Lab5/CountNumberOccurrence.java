package Lab5;

    public class CountNumberOccurrence {
        public static void main(String[] args) {
            int[] numbers = { 6, 22, 20, 11, 5, 18, 18, 16, 30, 9, 10, 10, 11, 5, 18, 18, 16 };
            int targetNumber = 18;
            int occurrenceCount = 0;

            for (int number : numbers) {
                if (number == targetNumber) {
                    occurrenceCount++;
                }
            }

            System.out.println("Number of occurrences of " + targetNumber + ": " + occurrenceCount);
        }
    }

