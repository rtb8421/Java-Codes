package Lab4;
    class ComplexNumber {
        private double real;
        private double imaginary;

        // Constructors
        public ComplexNumber(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        public ComplexNumber() {
            this(0.0, 0.0);
        }

        // Methods
        public double getReal() {
            return real;
        }

        public double getImaginary() {
            return imaginary;
        }

        public void display() {
            if (imaginary >= 0) {
                System.out.println(real + " + " + imaginary + "i");
            } else {
                System.out.println(real + " - " + (-imaginary) + "i");
            }
        }

        public ComplexNumber add(ComplexNumber other) {
            double newReal = this.real + other.real;
            double newImaginary = this.imaginary + other.imaginary;
            return new ComplexNumber(newReal, newImaginary);
        }

        public ComplexNumber subtract(ComplexNumber other) {
            double newReal = this.real - other.real;
            double newImaginary = this.imaginary - other.imaginary;
            return new ComplexNumber(newReal, newImaginary);
        }

        public ComplexNumber multiply(ComplexNumber other) {
            double newReal = this.real * other.real - this.imaginary * other.imaginary;
            double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
            return new ComplexNumber(newReal, newImaginary);
        }
    }

    public class ComplexNumberOperations {
        public static void main(String[] args) {
            ComplexNumber complex1 = new ComplexNumber(3.0, 4.0);
            ComplexNumber complex2 = new ComplexNumber(1.0, -2.0);

            System.out.print("Complex Number 1: ");
            complex1.display();

            System.out.print("Complex Number 2: ");
            complex2.display();

            ComplexNumber sum = complex1.add(complex2);
            System.out.print("Sum: ");
            sum.display();

            ComplexNumber difference = complex1.subtract(complex2);
            System.out.print("Difference: ");
            difference.display();

            ComplexNumber product = complex1.multiply(complex2);
            System.out.print("Product: ");
            product.display();
        }
    }