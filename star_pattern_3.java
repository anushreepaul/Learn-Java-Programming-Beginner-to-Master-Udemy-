public class star_pattern_3 {
    public static void main (String[] args)
    {
        int r = 5 ;
        for (int i = 1 ; i <= r ; i++)
        {
            for (int j = 1 ; j <= 5 ; j++)
            {
                if ( j>= i )
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
