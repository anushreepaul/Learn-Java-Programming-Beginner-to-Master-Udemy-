import java.util.*;
public class find_duplicate_characters_in_string 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the String : ");
        String str = sc.next();
        int count = 0 ;

        char[] char_array = str.toCharArray();

        for(int  i = 0 ; i<char_array.length ; i++)
        {
           count = 1 ;
           
           for(int j = i + 1 ; j <char_array.length ;j++)
           {
              if(char_array[i] == char_array[j] && char_array[i]!=' ')
              {
                   count++ ;
                   char_array[j] = '0' ;
              }
           }

           if(count>1 && char_array[i]!=' ')
           {
               System.out.println("Character repeated are : "+char_array[i]);
           }

           System.out.println("The number of times character repeat are : "+count);
        }

       

     sc.close();  

        
    }
    
}
