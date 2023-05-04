import java.util.*;

class Rectangle 
{
    public int length ;
    public int breadth ;

    public int area ()
    {
        return length * breadth ;
    }

    public int peremeter ()
    {
        return 2 * (length + breadth) ;
    }

}
public class Rectangle_class
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        Rectangle rec = new Rectangle() ;

        System.out.println();

        System.out.print("Enter the length : ");
        rec.length = sc.nextInt() ;

        System.out.println();

        System.out.print("Enter the breadth : ");
        rec.breadth = sc.nextInt() ;

        System.out.println();

        System.err.println("The area of the rectangle is : "+rec.area());

        System.out.println();

        System.out.println("The peremeter of the rectangle is : "+rec.peremeter());

        sc.close();

    }
    
}
