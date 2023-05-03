
import java.util.* ;
class Method_Overloading
{
    static int area (int length , int breadth)
    {
        return length * breadth ;
    }

    static double area (float radius)
    {
        return Math.PI*radius*radius ;
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Welcome User !");
        System.out.println();

        System.out.println("1.Calculate the area of the rectangle");
        System.out.println("2.Calculate the area of the circle");
        System.out.println();

        System.out.println("Enter the option : ");
        int option = sc.nextInt();
        switch(option)
        {
            case 1 : 
                     System.out.println("Enter the length : ");
                     int l = sc.nextInt();
                     System.out.println("Enter the breadth : ");
                     int b = sc.nextInt();

                     int area = area(l,b);
                     System.out.println("The area of the rectangle is : "+area);
                     System.out.println("Thank you !");
                     System.exit(0);

             case 2 : 
                     System.out.println("Enter the radius : ");
                     float r = sc.nextFloat();
                     
                     double area_circle = Math.round(area(r));
                     System.out.println("The area of the circle is : "+area_circle);
                     System.out.println("Thank you !");
                     System.exit(0);
        }

        sc.close();
        
           

    }
}