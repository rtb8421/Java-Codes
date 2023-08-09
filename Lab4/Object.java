package Lab4;

import Lab3.Box;

public class Object {
    static int count = 0;

    public Object()
    {
        count++;
    }

    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Object o4 = new Object();

        System.out.println("Total no. of object call :" +count);
    }
}
