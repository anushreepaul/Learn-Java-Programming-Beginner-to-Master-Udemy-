public class multiple_catch_block 
{
    /**
     * @param args
     */
    public static void main (String[] args)
    {
        int[] A = {30,20,10,40,0};

       try
       {
             //exception may arise if user try to divide numerator with 0 : ---> AirthmeticException
                int c = A[0] / A[1] ;
                System.out.println(c);
                
                //exception arise : Array Index Out of Bound : the index you are trying to access is not available 
                System.out.println(A[5]);

       }

       catch(ArithmeticException e)
       {
            System.out.println(e);
       }

       catch(ArrayIndexOutOfBoundsException a)
       {
          System.out.println(a);
       }
       

    }
    
}
