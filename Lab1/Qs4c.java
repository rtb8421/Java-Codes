package Lab1;

public class Qs4c {
    public static void main(String[] args) throws Exception{

        int n,x,sum=0,r;
        n=Integer.parseInt(args[0]);

        x=n;
        while(n>0)
        {
            r=n%10;
            sum= sum+(r*r*r);
            n=n/10;
        }
        if(x==sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an armstrong number");
    }
}
