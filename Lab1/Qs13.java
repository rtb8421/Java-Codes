package Lab1;

public class Qs13 {
    public static void main(String[] args) throws Exception {
        double p, r, t;

        p = Double.parseDouble(args[0]);
        r = Double.parseDouble(args[1]);
        t = Double.parseDouble(args[2]);

        double si = p * r * t / 100;
        double ci=p*(Math.pow((1+r/100),t))-p;
        System.out.println("Simple Interest is: " + si);
        System.out.println("Compound Interest is: " + ci);

    }
}
