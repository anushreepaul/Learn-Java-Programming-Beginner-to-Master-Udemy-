@SuppressWarnings ("unchecked")
class MyGenerics<T>
{
    private T a ;

    public  void setData (T v)
    {
        a = v ;
    }

    public void display()
    {
        System.out.println(a);
    }
}

class Mygeneric2 <T> extends MyGenerics<T>
{

}
public class extended_generic_class
{
    public static void main (String[] args)
    {
        MyGenerics<Integer> my = new MyGenerics<>() ;
        my.setData(4);
        my.display();

        Mygeneric2<Integer> my2 = new Mygeneric2<>() ;
        my2.setData(5);
        my2.display();

    }
}