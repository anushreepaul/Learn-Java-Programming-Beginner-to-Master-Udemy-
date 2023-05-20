import java.util.*;
public class ArrayListExample
{
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        ArrayList<Integer> arr = new ArrayList<Integer>() ;
        arr.add(1);
        arr.add(2) ;
        arr.add(3) ;
        arr.add(4) ;

        for(int x : arr)
        {
            System.out.print(x+" ");
        }

        System.out.println();

        for(int i = arr.size()-1 ; i>= 0 ; i--)
        {
            System.out.print(arr.get(i)+" ");
        }
        
    }
    
}
