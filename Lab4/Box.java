package Lab4;

public class Box {
    public int width;
    public int height;
    public int depth;

public Box(int width,int height,int depth)
{
    this.width = width;
    this.height = height;
    this.depth = depth;
}
public Box(Box otherBox)
{
    this.width= otherBox.width;
    this.height= otherBox.height;
    this.depth= otherBox.depth;
}
public void show()
{
    System.out.println("Width :"+width);
    System.out.println("height :"+height);
    System.out.println("depth:"+depth);
}

    public static void main(String[] args) {
        Box b1 = new Box(1,2,3);
        Box b2 = new Box(12,34,23);
        Box b3 = new Box(b2);

        b1.show();
        b2.show();
        b3.show();
    }

}
