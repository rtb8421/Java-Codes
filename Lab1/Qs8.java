package Lab1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Qs8 {
    public static void main(String[] args)throws Exception {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.println("Enter the number");
        int num=Integer.parseInt(br.readLine());

        System.out.println("The digits are :");
        while(num>0)
        {
            System.out.println(num%10+" ");
            num /=10;
        }

    }
}
