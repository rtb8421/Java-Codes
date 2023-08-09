package Lab2;

import java.util.Scanner;

public class Qs1 {
    public static void main(String[] args) {

        System.out.println("Enter the length of the rectangle");
        Scanner in=new Scanner(System.in);
        float l=in.nextFloat();
        System.out.println("Enter the bredth");
        float b=in.nextFloat();
        float side=8f;
        System.out.println("Enter the points of d1 and d2");
        float d1=in.nextFloat();
        float d2=in.nextFloat();
        float area1=l*b;
        double area2=1.73*side*side/4;
        float area3=(d1*d2)/2;
        System.out.println("Area of the rectangle is :"+area1);
        System.out.println("Area of Equilateral tringle is :"+area2);
        System.out.println("Area of the Rhombus is :"+area3);

    }
}
