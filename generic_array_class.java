class Generic_Array <T>
{
    T A[] = (T[]) new Object [3] ;
    int length = 0 ;

    public void append (T v)
    {
        A[length++] = v ;
    }

    public void display ()
    {
        for (T x : A)
        {
            System.out.print(x+" ");
        }
    }
}
public class generic_array_class 
{
    public static void main (String[] args)
    {
        Generic_Array<Integer> ga = new Generic_Array<>() ;
        
        ga.append(3);
        ga.append(2);
        ga.append(8);
        
        ga.display();
    }
    
}
