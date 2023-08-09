package Lab4;

public class Variable_Argument {
        public static void vaTest(int... args) {
            System.out.print("vaTest(int...): " + args.length + " arguments: ");
            for (int num : args) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        public static void vaTest(String str, int... args) {
            System.out.print("vaTest(String, int...): String: " + str + ", arguments: ");
            for (int num : args) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        public static void vaTest(String... args) {
            System.out.print("vaTest(String...): " + args.length + " arguments: ");
            for (String str : args) {
                System.out.print(str + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            vaTest(1, 2, 3);
            vaTest("Hello", 4, 5);
            vaTest("A", "B", "C");
        }
    }
