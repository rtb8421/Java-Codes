package Lab5pt2;

    import java.util.Scanner;

public class LineCountExample {
    public static void main(String[] args) {
        String text = "Sambalpur.\nUniversity\nSuiit";

        int lineCount = countLines(text);
        System.out.println("Number of lines: " + lineCount);
    }

    public static int countLines(String text) {
        String[] lines = text.split("\n");
        return lines.length;
    }
}

