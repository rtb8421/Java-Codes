package Lab1;

public class Qs14 {
    public static void main(String args[])
    {

        String input = "Rooohhhaaaannnnnnn";
        char search = 'a';

        int count=0;
        for(int i=0; i<input.length(); i++)
        {
            if(input.charAt(i) == search)
                count++;
        }

        System.out.println("The Character '"+search+"' appears "+count+" times.");
    }
}
