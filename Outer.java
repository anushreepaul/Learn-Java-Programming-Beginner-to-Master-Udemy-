public class Outer
{
   
    void display()
    {
        class Inner 
        {
            void InnerDisplay()
            {
                System.out.println("Hello");
            }
        }

        Inner i = new Inner() ;
        i.InnerDisplay();
    }


    public static void main (String[] args)
    {
       Outer o = new Outer() ;
       o.display();

    }

}
    

