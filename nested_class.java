class Outer 
{
    int x = 10 ;

    class Inner 
    {
        int y = 20 ;
        void displayinner()
        {
            System.out.println(x);
            System.out.println(y);
        }
    }

    void displayouter()
    {
        Inner i = new Inner() ;
        i.displayinner();
        System.out.println(i.y);
    }
}
public class nested_class
{
    public static void main (String[] args)
    {
        Outer.Inner i = new Outer().new Inner() ;
        i.displayinner();

    }

}