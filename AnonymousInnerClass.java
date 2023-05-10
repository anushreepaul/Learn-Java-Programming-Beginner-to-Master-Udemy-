interface My {
    void display();
}

class Outer 
{
    public void meth() 
    {
        My m = new My() 
        {
            @Override
            public void display() 
            {
                System.out.println("Hello");
            }
        };

        m.display();
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.meth();
    }
}
