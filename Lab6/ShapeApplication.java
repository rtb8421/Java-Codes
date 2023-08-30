package Lab6;

    interface Shape {
        double calculateArea();
        double calculatePerimeter();
    }

    // Implement the interface in a class
    class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    public class ShapeApplication {
        public static void main(String[] args) {
            // Create an instance of Circle
            Circle circle = new Circle(5.0);

            // Use the methods from the interface
            double area = circle.calculateArea();
            double perimeter = circle.calculatePerimeter();

            System.out.println("Circle Area: " + area);
            System.out.println("Circle Perimeter: " + perimeter);
        }
    }
