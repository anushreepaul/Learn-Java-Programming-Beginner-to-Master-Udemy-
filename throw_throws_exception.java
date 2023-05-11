
public class throw_throws_exception 
{
    static int area (int l , int b) throws Exception
    {
        if(l < 0 || b < 0)
        {
            throw new Exception ("Invalid Input ") ;
        }
        return l * b ;
    }

    static void fun1() throws Exception
    {
        System.out.println(area(-10,2)) ;
    }

    static void fun2 () throws Exception
    {
        fun1();
    }

    static void fun3 ()throws Exception
    {
        fun2();
    }
    public static void main (String[] args) 
    {

        try
        {
            fun3() ;
        }

        catch (Exception e )
        {
            System.out.println(e);
        }
        

    }
    
}
