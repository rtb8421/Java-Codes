package Lab2;

import java.util.Scanner;

public class Qs14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int gcd = 1;

        for (int i = 1; i <= n && i <= m; i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }
        System.out.println("The GCD of " + n + " and " + m + " is: " + gcd);
    }
}
