public class exception_handling_example 
{
    public static void main (String[] args)
    {
        /** 
        int a = 10 , b = 2 , c ;
        c = a / b ;
        System.out.println(c);
        System.out.println("Bye");

        */

        int a = 10 ;
        int b = 0 ;
        int c ;

        //exception arise : AirthmeticException (anything divided by 0 is infinity and infinity is not defined in java)
        try
        {
            c = a / b ;

            System.out.println(c);

        }

        catch (ArithmeticException e)
        {
            System.out.println("Division Error "+e);
        }
       
        System.out.println("Bye");
    }
    
}
