class Cyclinder
{
    public double radius ;
    public int height ;

    public double volume ()
    {
        return Math.PI * radius * radius * height ;
    }

    public double surface_area ()
    {
        return (2 * Math.PI * radius * height ) + (2 * Math.PI * radius * radius) ;
    }

    public double top_area ()
    {
        return Math.PI *radius * radius ;
    }

    public int getheight ()
    {
        return height ;
    }

    public double getradius()
    {
        return radius ;
    }
}
public class Cyclinder_class 
{
    public static void main (String[] args)
    {
        Cyclinder cl = new Cyclinder() ;
        cl.radius = 3.5 ;
        cl.height = 6 ;

        System.out.println(); 

        System.err.println("Volume : "+cl.volume());
        System.out.println();

        System.out.println("Surface area : "+cl.surface_area());
        System.out.println();

        System.out.println("Top Area : "+cl.top_area());
        System.out.println();

        System.out.println("Height : "+cl.getheight());

        System.out.println();
        System.out.println("Radius : "+cl.getradius());

        System.out.println();

    }
    
}
