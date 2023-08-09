package Lab1;

import java.util.Scanner;

public class Qs13b {
    public static void main(String args[])
    {
        //Take input from the user
        //Create an instance of the Scanner class
        Scanner sc = new Scanner(System.in);
        //Declare variables
        float p, r, t, n;
        System.out.println("Enter the Principal : ");
        p = sc.nextFloat();     //Initialize the variables
        System.out.println("Enter the Rate of interest : ");
        r = sc.nextFloat();     //Initialize the variables
        System.out.println("Enter the Time period : ");
        t = sc.nextFloat();     //Initialize the variables
        System.out.println("Enter the number of times that interest is compounded per unit t");
        n=sc.nextFloat();      //Initialize the variables
        sc.close();

        //Calculate the compound interest
        double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.println("Compound Interest after " + t + " years: "+cinterest);
        System.out.println("Amount after " + t + " years: "+amount);
    }
}
