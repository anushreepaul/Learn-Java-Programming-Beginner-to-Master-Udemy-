import java.util.*;

class Circle 
{
    public  double radius ;
    
    public  double area()
    {
        return Math.PI*radius*radius;
    }

    public  double perimeter()
    {
        return 2 * Math.PI * radius;
       
    }

};
public class Circle_class
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in) ;

        Circle c = new Circle() ;

        System.out.println();

        System.out.print("Enter the circle radius : ");

        c.radius = sc.nextFloat() ;

        System.out.println("The area of the Circle is : "+c.area());

        System.out.println();

        System.out.println("The perimeter of the Circle is : "+c.perimeter());

        System.out.println();

        sc.close();

       
    }
    
}
