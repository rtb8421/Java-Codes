package Lab2;

import java.util.Scanner;

public class Qs3 {
    public static void main(String[] args) {
        System.out.println("Enter two number");
        Scanner sc = new Scanner(System.in);
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();

        float quotient = n1/n2;

        float remainder = n1%n2;


        System.out.println(quotient);
        System.out.println(remainder);
    }
}
