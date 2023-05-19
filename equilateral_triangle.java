public class equilateral_triangle 
{
    public static void main(String[] args)
    {
       
        for(int i = 1 ; i <= 5 ; i++)
        {
            //to print spaces---->
            for(int j = 5 ; j>= i ; j--)
            {
                System.out.print(" ");
            }

            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

        
    }
    
}
