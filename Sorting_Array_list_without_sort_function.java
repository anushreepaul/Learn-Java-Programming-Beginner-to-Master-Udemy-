import java.util.*;
public class Sorting_Array_list_without_sort_function
{
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        ArrayList<Integer> arr = new ArrayList<Integer>() ;
        arr.add(1);
        arr.add(2) ;
        arr.add(4) ;
        arr.add(3) ;

        int temp = 0 ;

        Object[] obj = arr.toArray();

       for(int i = 0 ; i < obj.length ; i++)
       {
          for(int j = i+1 ; j < obj.length ; j++)
          {
            if((Integer)obj[i] > (Integer)obj[j])
            {
                temp = (Integer) obj[i] ;
                obj[i] = obj[j] ;
                obj[j] = temp ;

            }
            
          }
       }

       for(Object x : obj)
       {
         System.out.print(x);
       }

        
    }
    
}
