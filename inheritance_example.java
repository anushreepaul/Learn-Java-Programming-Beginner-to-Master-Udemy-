class Circle 
{

    public double radius;

    public double area()
    {
        return Math.PI *radius *radius ;
    }

    public double perimeter()
    {
        return 2 * Math.PI*radius ;
    }

    public double circumference()
    {
        return perimeter() ;
    }
}

class Cylinder extends Circle
{
    public double height;
    
    public double volume()
    {
        return area()*height;
    }
    
}

public class inheritance_example
{
    public static void main (String[] args)
    {
        Cylinder c = new Cylinder() ;
        
        c.radius = 10 ;
        c.height = 20;

        
        System.out.println("Volume : "+c.volume());
        System.out.println(c.area());
    }
}