public class Print_Pattern_3 
{
    public static void main (String[] args)
    {
        int count = 1 ;
        int n = 5 ;
        for(int i = 1 ; i <=n ; i++)
        {
            for(int j = 1 ; j<= (n-i+1); j++)
            {
                System.out.print(count+" ");
                 count++;

            }

            System.out.println();
        }
    }
    
}
