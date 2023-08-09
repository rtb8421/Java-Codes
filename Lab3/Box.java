package Lab3;

public class Box {
    double width;
    double height;
    double depth;

    public Box(double width , double height, double depth)
    {
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    public double getvol()
    {
        return width*height*depth;
    }

    public static void main(String[] args) {
        Box a = new Box(5.0,3.0,2.0);
        Box b = new Box(10.0,4.5,7.2);

        System.out.println("volume of box a "+a.getvol());
        System.out.println("Volume of box b "+b.getvol());
    }
}
