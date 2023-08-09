package Lab3;

public class Area {
        public static class Rectangle {
            public double length;
            public double width;

            public Rectangle(double length, double width) {
                this.length = length;
                this.width = width;
            }

            public double calculateArea() {
                return length * width;
            }
        }

        public static class Circle {
            public double radius;
            public static final double PI = 3.14159;

            public Circle(double radius) {
                this.radius = radius;
            }

            public double calculateArea() {
                return PI * radius * radius;
            }
        }

        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle(5, 3);
            double rectangleArea = rectangle.calculateArea();
            System.out.println("Area of Rectangle: " + rectangleArea);

            Circle circle = new Circle(4);
            double circleArea = circle.calculateArea();
            System.out.println("Area of Circle: " + circleArea);
        }
    }

