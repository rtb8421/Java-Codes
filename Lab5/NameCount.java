package Lab5;
public class NameCount {
    public static void main(String[] args) {
        String[] names = {
                "Rohan", "Roshan", "Rohan", "Vishal", "Rohan", "Abhisek"
        };

        String targetName = "Rohan";
        int count = 0;

        for (String name : names) {
            if (name.equals(targetName)) {
                count++;
            }
        }

        System.out.println("Number of occurrences of \"" + targetName + "\": " + count);
    }
}

