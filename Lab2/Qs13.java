package Lab2;

public class Qs13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("HELLO_FINE");
            } else if (i % 3 == 0) {
                System.out.println("HELLO");
            } else if (i % 5 == 0) {
                System.out.println("FINE");
            } else {
                System.out.println(i);
            }
        }
    }
}
