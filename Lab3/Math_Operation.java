package Lab3;

public class Math_Operation {
    public static int fun(int x) {
        return x * x;
    }

    public static int fun(int x, int y) {
        return x * x + y * y;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 3;

        int result1 = fun(x);
        int result2 = fun(x, y);

        System.out.println("fun(x) = " + result1);
        System.out.println("fun(x, y) = " + result2);
    }

}
