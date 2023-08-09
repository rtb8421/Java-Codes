package Lab4;
    public class Fibonacci {
        public static int recursiveFibo(int n) {
            if (n <= 1) {
                return n;
            } else {
                return recursiveFibo(n - 1) + recursiveFibo(n - 2);
            }
        }
        public static int nonRecursiveFibo(int n) {
            if (n <= 1) {
                return n;
            }

            int prev = 0;
            int current = 1;
            for (int i = 2; i <= n; i++) {
                int temp = current;
                current = prev + current;
                prev = temp;
            }
            return current;
        }

        public static void main(String[] args) {
            int n = 10;
            System.out.println("Using Recursive Function " + recursiveFibo(n));
            System.out.println("Using Non-Recursive Function: " + nonRecursiveFibo(n));
    }
}
