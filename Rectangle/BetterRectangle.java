import java.awt.Rectangle;

public class BetterRectangle extends Rectangle
{
    public BetterRectangle(int x, int y, int w, int h)
    {
        super(x, y, w, h);
    }

    public double getPerimeter()
    {
        double h = super.getHeight();
        double w = super.getWidth();
        return 2*w+2*h;
    }

    public double getArea()
    {
        double h = super.getHeight();
        double w = super.getWidth();
        return w*h;
    }
    
    public static void main(String args[])
    {
        BetterRectangle Rect = new BetterRectangle(0,0,5,4);
        System.out.println(Rect.getPerimeter() + " " + Rect.getArea());
    }
}
