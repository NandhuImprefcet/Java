class Shapes
{
    public void area()
    {
        System.out.println("The formula or area of ");
    }
}

class Triangle extends Shapes
{
    public void area()
    {
        System.out.println("Triangle is 1/2 * base * height");
    }
}

class Circle extends Shapes
{
    public void area()
    {
        System.out.println("Circle is 3.14 * radius * radius");
    }
}
/*
This type of referinig the subclass object with the variable of the super class is called upcasting
*/
public class Overridden
{
    public static void main(String []args)
    {
        Shapes shape = new Shapes();
        Shapes tri = new Triangle();
        Shapes cir = new Circle();
        shape.area();
        tri.area();
        cir.area();
    }
}
