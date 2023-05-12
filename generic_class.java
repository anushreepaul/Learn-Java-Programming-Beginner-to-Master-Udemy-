class Data<T>
{
    private T obj ;
    
    public void setData(T v)
    {
        obj = v ;
    }

    public T getData ()
    {
        return obj ;
    }
}
public class generic_class 
{
    public static void main (String[] args)
    {
        Data<Integer> d = new Data<>();
        d.setData(2);
        System.out.println(d.getData()); 

    }
    
}
