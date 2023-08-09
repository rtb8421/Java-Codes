package Lab3;

public class student {
    public int roll;
    public int mark;

    public void get(int roll , int mark)
    {
        this.roll=roll;
        this.mark=mark;
    }
    public void show()
    {
        System.out.println("My roll is "+ roll +".My mark in oop is " + mark +".");
    }

    public static void main(String[] args) {
        student student = new student();

        student.get(31 , 78);
        student.show();
    }
}
