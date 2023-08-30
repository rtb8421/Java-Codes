package Lab5pt2;

public class StringOperations {
    public static void main(String[] args) {
        String myName = "Rohan Patel";

        int length = myName.length();
        System.out.println("Length of the string: " + length);

        boolean containsA = false;
        int countA = 0;

        for (int i = 0; i < myName.length(); i++) {
            if (myName.charAt(i) == 'a') {
                containsA = true;
                countA++;
                System.out.println("'a' found at position " + (i + 1));
            }
        }

        if (containsA) {
            System.out.println("'a' appears " + countA + " times in the name.");
        } else {
            System.out.println("'a' is not present in the name.");
        }
    }
}
