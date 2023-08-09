package Lab4;
import java.io.*;
public class Sum {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.println("Enter a number");
        int n = Integer.parseInt(br.readLine());

        int sum = 0;

        for (int i = 1;i<=n;i++)
        {
            sum = sum+i;
        }
        System.out.println("Sum of nth number is :"+sum);
    }
}
