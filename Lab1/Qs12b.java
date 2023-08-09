package Lab1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Qs12b {
    public static void main(String[] args) throws Exception {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        System.out.println("Enter first two point");
        long x1=Long.parseLong(br.readLine());
        long y1=Long.parseLong(br.readLine());

        System.out.println("Enter second two point");
        long x2=Long.parseLong(br.readLine());
        long y2=Long.parseLong(br.readLine());

        double distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

        System.out.println("Distance between two points:"+distance);


    }
}
