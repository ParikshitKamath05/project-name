abstract class Shape
{   
    double base;
    double height;        
    Shape(double b, double h)
    {
        base=b;
        height=h;
    }
    abstract void computeArea();
}
class Triangle extends Shape
{
    Triangle(double b.double h)
    {
        super(b,h);
    } 
    void computeArea()
    {
        double area=0.5*base*height;
        System.out.println("The area calculated is=" +area);
    }
}
class Rectangle extends Shape
{
    Rectangle(double b.double h)
    {
        super(b,h);
    } 
    void computeArea()
    {
        double area=base*height;
        System.out.println("The area calculated is=" +area);
    }
}
