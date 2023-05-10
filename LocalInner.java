public class LocalInner
{
    int x = 10 ;
   
    void display()
    {
        class Inner 
        {
            int y = 20 ;
            void InnerDisplay()
            {
                System.out.println("Hello");
            }
        }

        Inner i = new Inner() ;
        System.out.println(i.y);
        i.InnerDisplay();
    }


    public static void main (String[] args)
    {
       LocalInner o = new LocalInner() ;
       System.out.println(o.x);
       o.display();
     
       

    }

}
    

