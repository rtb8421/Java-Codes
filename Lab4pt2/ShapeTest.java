package Lab4pt2;

    abstract class Shape {
        protected int base;
        protected int height;

        public Shape(int base, int height) {
            this.base = base;
            this.height = height;
        }

        public abstract void printArea();
    }

    class
    Rectangle extends Shape {
        public Rectangle(int base, int height) {
            super(base, height);
        }

        @Override
        public void printArea() {
            int area = base * height;
            System.out.println("Rectangle Area: " + area);
        }
    }

    class Triangle extends Shape {
        public Triangle(int base, int height) {
            super(base, height);
        }

        @Override
        public void printArea() {
            double area = 0.5 * base * height;
            System.out.println("Triangle Area: " + area);
        }
    }

    class Circle extends Shape {
        public Circle(int radius) {
            super(radius, radius); // For a circle, consider base and height as the radius.
        }

        @Override
        public void printArea() {
            double area = Math.PI * base * base;
            System.out.println("Circle Area: " + area);
        }
    }

    public class ShapeTest {
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle(5, 10);
            Triangle triangle = new Triangle(8, 6);
            Circle circle = new Circle(7);

            rectangle.printArea();
            triangle.printArea();
            circle.printArea();
        }
    }
