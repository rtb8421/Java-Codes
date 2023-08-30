package Lab5;

public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "MADAM";
        String input2 = "Dot saw I was Tod";

        String reversed = new StringBuilder(input).reverse().toString();
        String reversed2 = new StringBuilder(input2).reverse().toString();

        if (input.equalsIgnoreCase(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        System.out.println("Original string: " + input2);
        System.out.println("Reversed string: " + reversed2);
    }
}

