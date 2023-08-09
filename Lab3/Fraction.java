package Lab3;

public class Fraction {
         int numerator;
         int denominator;
        public Fraction() {
            this.numerator = 1;
            this.denominator = 1;
        }
        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            if (denominator != 0) {
                this.denominator = denominator;
            } else {
                return;
            }
        }
        public Fraction(int numerator) {
            this.numerator = numerator;
            this.denominator = 1;
        }
        public void displayFraction() {
            System.out.println(numerator + "/" + denominator);
        }

        public static void main(String[] args) {
            Fraction fraction1 = new Fraction(); // 1/1
            Fraction fraction2 = new Fraction(3, 4); // 3/4
            Fraction fraction3 = new Fraction(5); // 5/1

            //System.out.print("Fraction 1: ");
            fraction1.displayFraction();

           // System.out.print("Fraction 2: ");
            fraction2.displayFraction();

           // System.out.print("Fraction 3: ");
            fraction3.displayFraction();
        }
    }

