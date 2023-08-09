package Lab1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Qs9 {
    public static void main(String[] args)throws Exception {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.println("Enter the first number");
        int a=Integer.parseInt(br.readLine());
        System.out.println("Enter the second number");
        int b=Integer.parseInt(br.readLine());

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("First no. after swap:"+a);
        System.out.println("Second no. after swap:"+b);
    }
}
