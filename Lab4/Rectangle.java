package Lab4;

public class Rectangle {
        private double width;
        private double length;
        private double area;
        private String color;

        public Rectangle(double width, double length, String color) {
            this.width = width;
            this.length = length;
            this.color = color;
            calculateArea();
        }

        public double getLength() {
            return length;
        }

        public double getWidth() {
            return width;
        }

        public String getColor() {
            return color;
        }

        public double getArea() {
            return area;
        }

        private void calculateArea() {
            area = width * length;
        }

        public boolean isMatching(Rectangle other) {
            return this.area == other.area && this.color.equals(other.color);
        }
    }

