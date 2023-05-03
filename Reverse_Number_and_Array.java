
import java.util.Scanner;

public class Reverse_Number_and_Array 
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Welcome User !");
        System.out.println();

        System.out.println("1. Reverse a Number ");
        System.out.println();

        System.out.println("2. Reverse an Array ");
        System.out.println();

        System.out.print("Choose the option : "+" ");
        int option = sc.nextInt() ;
        switch(option)
        {
            case 1 :  System.out.println();
                      System.out.print("Enter the number : "+" ");
                      int n = sc.nextInt() ;
                      String str = "" ;
                      while (n > 0)
                      {
                         int r = n % 10 ;
                         str = str + r ;
                         n = n / 10 ;
                         
                      }

                      int value = Integer.parseInt(str);
                      System.out.println();
                      System.out.println ("The reverse number is : "+value) ;
                      System.out.println();
                      System.out.println("Thank you !");
                      System.exit(0);

            case 2 :  int[] arr = new int [6] ;
                      System.out.println();
                      System.out.print("Enter the array elements : "+" ");
                      for(int i = 0 ; i < arr.length ; i++)
                      {
                         arr[i] = sc.nextInt() ;
                      }

                      int i = 0 ;
                      int j = arr.length - 1 ;
                      int temp = 0 ;

                      while (i <= j)
                      {
                         temp = arr[i] ;
                         arr[i] = arr[j] ;
                         arr[j] = temp ;

                         i++ ;
                         j-- ;
                      }

                      System.out.println();
                      System.out.print("The reverse array is : "+" ");
                      for(int x : arr)
                      {
                          System.out.print(x+" ");
                      }

                      System.out.println();
                      System.out.println("Thank you !");

                      System.exit(0);

            

        }

        sc.close() ;
        
    }
    
}
