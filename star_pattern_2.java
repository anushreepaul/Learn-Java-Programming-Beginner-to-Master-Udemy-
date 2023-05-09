public class star_pattern_2 
{
    public static void main (String[] args)
    {
        int r = 5 ;
        for (int i = 1 ; i <= r ; i++)
        {
            for(int j = 1 ; j <= r ; j++)
            {
                if( i + j > 5)
                {
                    System.out.print("*");
                }

                else
                {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
    
}
