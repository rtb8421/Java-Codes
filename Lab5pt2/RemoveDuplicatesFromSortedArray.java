package Lab5pt2;
    import java.util.Arrays;

    public class RemoveDuplicatesFromSortedArray {
        public static int[] removeDuplicates(int[] sortedArray) {
            if (sortedArray.length == 0) {
                return sortedArray;
            }

            int[] result = new int[sortedArray.length];
            int index = 0;
            result[index++] = sortedArray[0];

            for (int i = 1; i < sortedArray.length; i++) {
                if (sortedArray[i] != sortedArray[i - 1]) {
                    result[index++] = sortedArray[i];
                }
            }

            return Arrays.copyOf(result, index);
        }

        public static void main(String[] args) {
            int[] sortedArray = { 1, 2, 2, 3, 3, 3, 4, 5, 5 };

            int[] uniqueArray = removeDuplicates(sortedArray);

            System.out.println("Original sorted array: " + Arrays.toString(sortedArray));
            System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
        }
    }
