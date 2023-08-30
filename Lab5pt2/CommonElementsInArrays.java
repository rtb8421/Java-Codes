package Lab5pt2;

public class CommonElementsInArrays {
    public static void findCommonElements(int[] array1, int[] array2) {
        System.out.print("Common elements: ");

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                    break;
                }
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        findCommonElements(array1, array2);
    }
}
