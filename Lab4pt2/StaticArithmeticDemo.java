package Lab4pt2;

    class ArithmeticOperations {
        public static int mul(int a, int b) {
            return a * b;
        }

        public static double div(double a, double b) {
            if (b != 0) {
                return a / b;
            } else {
                return 0;
            }
        }
    }

    public class StaticArithmeticDemo {
        public static void main(String[] args) {
            int num1 = 10;
            int num2 = 5;

            int product = ArithmeticOperations.mul(num1, num2);
            System.out.println("Product: " + product);

            double dividend = 15.0;
            double divisor = 3.0;

            double quotient = ArithmeticOperations.div(dividend, divisor);
            System.out.println("Quotient: " + quotient);
        }
    }

