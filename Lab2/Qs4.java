package Lab2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Qs4 {
    public static void main(String[] args) throws Exception{
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.println("Enter the year");
        int n = Integer.parseInt(br.readLine());
        if(n%400==0)
        {
            System.out.println("Leap year");
        }
        else if(n%100==0)
        {
            System.out.println("Century");
        }
        else if(n%4==0)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not a Leap year");
        }

    }
}
