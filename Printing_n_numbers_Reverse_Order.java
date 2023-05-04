public class Printing_n_numbers_Reverse_Order 
{
    static void reverse_order (int n)
    {
        if(n > 0)
        {
            
            System.out.print(n+" ");
            reverse_order(n - 1);
        }
    }
    public static void main (String[] args)
    {
        
        reverse_order(4) ;
    }
    
}
