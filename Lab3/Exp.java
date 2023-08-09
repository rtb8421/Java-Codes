package Lab3;

import java.util.Scanner;

public class Exp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result1 = (a << 2) + (b >> 2);

        System.out.println(result1);
        boolean result2 = b > 0;

        System.out.println(result2);

        int result3 = (a + b * 100) / 10;


        System.out.println(result3);
        int result4 = a & b;

        System.out.println(result4);
    }
}
