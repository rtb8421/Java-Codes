package Lab1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Qs7 {
    public static void main(String[] args)throws Exception {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.println("Enter the number of elements");
        int n=Integer.parseInt(br.readLine());

        int arr[]=new int[n];
        int sum=0;

        System.out.println("Enter the number");

        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
            sum+=arr[i];

        }
        double mean=(double)sum/n;
        System.out.println("Mean of the given number is:"+mean);
    }
}
