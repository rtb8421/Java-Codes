package Lab1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Qs3 {
    public static void main(String[] args) throws Exception{
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int a,b,c,sum,sub,mul,mod;
        float div;

        System.out.println("Enter three number");
        a=Integer.parseInt (br.readLine());
        b=Integer.parseInt (br.readLine());
        c=Integer.parseInt (br.readLine());
        System.out.println("Enter the operator (+,-,*,/,%)");
        String x=br.readLine();

        switch (x) {
            case "+":sum=a+b+c;
                System.out.println(sum);
                break;

            case "-":sub=a-b-c;
                System.out.println(sub);
                break;

            case "*":mul=a*b*c;
                System.out.println(mul);
                break;

            case "/":div=(float)a/b/c;
                System.out.println(div);
                break;

            case "%":mod=a%b%c;
                System.out.println(mod);
                break;

            default : System.out.println("Invalid Operator");

        }
    }
}
