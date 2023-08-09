package Lab1;

public class Qs10 {
    public static void main(String[] args) {

        int decimalNumber = Integer.parseInt(args[0]);
        char character = (char) decimalNumber;
        String octal = Integer.toOctalString(decimalNumber);
        String hexadecimal = Integer.toHexString(decimalNumber);
        System.out.println("Decimal number: " + decimalNumber);
        System.out.println("Character: " + character);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);
    }
}
