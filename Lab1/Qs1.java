package Lab1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Qs1 {
            public static void main(String[] args) throws Exception {
                InputStreamReader is = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(is);
                System.out.println("Enter your first name");
                java.lang.String a = br.readLine();

                System.out.println("Enter your second name");
                java.lang.String b = br.readLine();

                System.out.println(a + " " + b);
            }
}
