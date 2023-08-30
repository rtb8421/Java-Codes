package Lab5;

public class ArrayManipulation {
    public static void main(String[] args) {
        int[] integerArray;

        integerArray = new int[5];

        integerArray[0] = 1;
        integerArray[1] = 87;
        integerArray[2] = 27;
        integerArray[3] = 69;
        integerArray[4] = 125;

        integerArray[2] = -7;

        integerArray[0] = integerArray[4];

        System.out.println(integerArray[0]);
        System.out.println(integerArray[2]);
    }
}
