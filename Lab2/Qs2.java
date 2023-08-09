package Lab2;
import java.util.*;
public class Qs2 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        if(n>=10)
        {
            for(int i = 1;i<=n;i++)
            {
                if(n%i==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                int temp = n;
                int reverse = 0;

                while(temp!=0)
                {
                    int digit = temp%10;
                    temp = temp/10;
                    reverse = reverse*10+digit;
                }
                int count2 = 0;
                for(int i = 1;i<=reverse;i++)
                {
                    if(reverse%i==0)
                    {
                        count2++;
                    }
                }
                if(count2==2)
                    System.out.println("Emprip number");
                else
                    System.out.println("Not an Emprip number");
            }
            else
                System.out.println("Not an Emprip number");
        }
        else
            System.out.println("Not an Emprip number");
    }
}
