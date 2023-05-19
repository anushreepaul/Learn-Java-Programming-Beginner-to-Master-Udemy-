public class prime_number 
{
    public static void main(String[] args) 
    {
        int n = 1 ;

        int m = n / 2 ;

        int flag = 0 ;

        if(n == 0 || n == 1)
        {
            System.out.println("Not Prime");
        }

        else
        {
            for(int i = 2 ; i <= m  ; i++)
            {
                if(n % i == 0)
                {
                    System.out.println("Not Prime");

                    flag = 1 ;

                    break ;

                }
            }

            if(flag == 0)
            {
                System.out.println("Prime");
            }
        }

       
        
    }
    
}
