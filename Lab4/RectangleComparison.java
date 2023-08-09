package Lab4;

public class RectangleComparison {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5.0, 10.0, "Blue");
        Rectangle rect2 = new Rectangle(7.5, 6.0, "Blue");

        System.out.println("Rectangle 1:");
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Length: " + rect1.getLength());
        System.out.println("Color: " + rect1.getColor());
        System.out.println("Area: " + rect1.getArea());

        System.out.println();

        System.out.println("Rectangle 2:");
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Length: " + rect2.getLength());
        System.out.println("Color: " + rect2.getColor());
        System.out.println("Area: " + rect2.getArea());

        if (rect1.isMatching(rect2)) {
            System.out.println("\nMatching Rectangle");
        } else {
            System.out.println("\nNon-Matching Rectangle");
        }
    }
}
