public class checked_unchecked_exception 
{
    static void fun1()
    {
        try
        {
            System.out.print(10/0) ;
        }

        catch (ArithmeticException e)
        {
            System.out.println(e);
            e.printStackTrace() ;
        }


        
    }

    static void fun2()
    {
        fun1() ;
    }

    static void fun3()
    {
        fun2(); 
    }


    public static void main (String[] args)
    {
        fun3();

    }
    
}
