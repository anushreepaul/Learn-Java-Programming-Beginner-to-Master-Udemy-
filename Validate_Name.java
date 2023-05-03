
import java.util.Scanner;

public class Validate_Name 
{
    static boolean validate_name (String name )
    {
        if (name.matches("[a-zA-Z\\s]+"))
        {
            return true ;
        }

        else
        {
            return false ;
        }

    }
    
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in) ;
        System.out.println("Enter the name : ");
        String name = sc.next() ;

        boolean validate = validate_name(name) ;
        System.out.println("The string is validate : yes or no ? "+validate);
        sc.close();
    }
}
