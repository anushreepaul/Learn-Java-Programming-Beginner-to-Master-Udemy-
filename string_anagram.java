import java.util.* ;
public class string_anagram 
{
    /**
     * @param args
     */
    public static void main(String[] args) 
    {

        String str1 = "anushreeDeb";
        String str2 = "Debanushree";

        if(str1.length() != str2.length())
        {
            System.out.println("No they are not anagram ");
        }

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);


       
            for(int i = 0 ; i < str1.length() ; i++)
            {
                if(array1[i] != array2[i])
                {
                   System.out.println("Not Anagram");
                }
            }

            System.out.println("Anagram !");

        
        
        
        
    }
    
}
