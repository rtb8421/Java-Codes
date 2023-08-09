package Lab2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Qs6 {
    public static void main(String[] args) throws Exception{
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.print("Enter the month: ");
        String month = br.readLine();

        int days;

        switch (month.toLowerCase()) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                days = 31;
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                days = 30;
                break;
            case "february":
                days = 28;
                break;
            default:
                System.out.println("Invalid month");
                return;
        }

        System.out.println("Number of days in " + month + ": " + days);

    }
}
