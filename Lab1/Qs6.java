package Lab1;

public class Qs6 {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int big = a > b ? a > c ? a : c : b > c ? b : c;
        int small = a < b ? a < c ? a : c : b < c ? b : c;

        System.out.println("Largest number is:" + big);
        System.out.println("Smallest number is:" + small);
    }
}
