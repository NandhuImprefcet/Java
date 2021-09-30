class Point
{
    int x,y;
    void setX(int x)
    {
        this.x=(x>79?79:(x<0?0:x));
    }
    void setY(int y)
    {
        this.y=(y>24?24:(y<0?0:y));
    }
    int getX()
    {
        return x;
    }
    int getY()
    {
        return y;
    }
}
public class PointDemo
{
    public static void main(String []args)
    {
        Point p = new Point();
        p.x=52;
        p.y=25;
        System.out.println("X: "+p.x+" Y: "+p.y);
        p.setX(-22);
        p.setY(144);
        System.out.println("X: "+p.getX()+" Y: "+p.getY());
    }
}