package Lab3;

public class Numprint {
    public void show(int num) {
        System.out.println("Number: " + num);
    }

    public void show(int num1, int num2) {
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
    }

    public void show(int num1, int num2, int num3) {
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Number 3: " + num3);
    }

    public static void main(String[] args) {
        Numprint numberPrinter = new Numprint();

        numberPrinter.show(10);

        numberPrinter.show(20, 30);

        numberPrinter.show(40, 50, 60);
    }

}
