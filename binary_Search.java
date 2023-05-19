public class binary_Search 
{
    public static void main(String[] args) 
    {
        
        int element = 9 ;

        int[] arr = {1,2,3,4} ;

        int n = arr.length ;
       

        int start = 0 ;
        int end = n-1 ;

        int mid = (start + end) / 2 ;

        while (start <= end)
        {
            if(arr[mid] == element)
            {
                System.out.println("element found !");
              
                break ;
            }

            else if (arr[mid] < element)
            {
                start = mid + 1 ;
            }

            else 
            {
                end = mid -  1 ;
            }

            mid = (start + end )/ 2 ;
        }

        if ( start > end ){  
            System.out.println("Element is not found!");  
         }  

    }
    
}
