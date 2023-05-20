public class string_palindrome
{
    public static void main(String[] args) 
    {
        String str = "aabaad";

        String str2 ="" ;

        for(int i = str.length()-1 ; i>= 0 ; i--)
        {
            str2 = str2 + str.charAt(i);
        }

        System.out.println("Printing the character : "+str2);

        if(str.equals(str2))
        {
            System.out.println("Yes");
        }

        else 
        {
            System.out.println("No");
        }
        
    }
    
}
