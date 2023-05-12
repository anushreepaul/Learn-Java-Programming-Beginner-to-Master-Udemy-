class MyGeneric <T extends Number>
{
    T a ;

    public void setData (T v)
    {
        a = v ;
    }

    public void display()
    {
        System.out.println(a);
    }
}
public class bounded_generic_class 
{
    public static void main (String[] args)
    {
        MyGeneric<Integer> am = new MyGeneric<>() ;
        am.setData(1);
        am.display();
        
    }
    
}
