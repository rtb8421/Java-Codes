package Lab4;

class NumberWrapper {
    int num;

    NumberWrapper(int num) {
        this.num = num;
    }
}

public class SwapNumbers {
    // Call by value
    static void swapByValue(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    // Call by reference
    static void swapByReference(NumberWrapper a, NumberWrapper b) {
        int temp = a.num;
        a.num = b.num;
        b.num = temp;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        swapByValue(num1, num2);

        System.out.println("\nAfter swapping by value:");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        num1 = 5;
        num2 = 10;

        NumberWrapper wrapper1 = new NumberWrapper(num1);
        NumberWrapper wrapper2 = new NumberWrapper(num2);

        swapByReference(wrapper1, wrapper2);

        System.out.println("\nAfter swapping by reference:");
        System.out.println("num1: " + wrapper1.num);
        System.out.println("num2: " + wrapper2.num);
    }
}
