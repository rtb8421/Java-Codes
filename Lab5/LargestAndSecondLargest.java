package Lab5;

    public class LargestAndSecondLargest {
        public static void main(String[] args) {
            int[] array = { 5, 10, 3, 8, 15, 7 };
            int[] result = findLargestAndSecondLargest(array);

            System.out.println("Largest: " + result[0]);
            System.out.println("Second Largest: " + result[1]);
        }

        public static int[] findLargestAndSecondLargest(int[] nums) {
            if (nums.length < 2) {
                throw new IllegalArgumentException("Array should have at least two elements");
            }

            int largest = Math.max(nums[0], nums[1]);
            int secondLargest = Math.min(nums[0], nums[1]);

            for (int i = 2; i < nums.length; i++) {
                if (nums[i] > largest) {
                    secondLargest = largest;
                    largest = nums[i];
                } else if (nums[i] > secondLargest && nums[i] != largest) {
                    secondLargest = nums[i];
                }
            }

            return new int[] { largest, secondLargest };
        }
    }
