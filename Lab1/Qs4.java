package Lab1;

public class Qs4 {
    public static void main(String[] args)throws Exception {
        System.out.println("Enter a num");
        int n;
        int count = 0;


        n = Integer.parseInt(args[0]);

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;

            }
        }
        if (count == 2) {
            System.out.println("prime number");

        } else {
            System.out.println("Not prime");
        }
    }
}
