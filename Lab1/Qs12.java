package Lab1;

public class Qs12 {
    public static void main(String[] args) throws Exception {
        long x1,x2,y1,y2;
        x1=Long.parseLong (args[0]);
        y1=Long.parseLong (args[1]);
        x2=Long.parseLong (args[2]);
        y2=Long.parseLong (args[3]);

        double distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

        System.out.println("Distance between two points:"+distance);


    }
}
