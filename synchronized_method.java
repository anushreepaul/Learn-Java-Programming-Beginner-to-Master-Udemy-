class Mydata 
{
   synchronized public void display (String str)
    {
        for (int i = 0 ; i < str.length() ; i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
    }
}

class Thread1 extends Thread 
{
    Mydata data ;
    public Thread1 (Mydata d )
    {
       data = d ;
    }

    public void run () 
    {
        data.display("Hello World ");
    }
}

class Thread2 extends Thread 
{
    Mydata data ;

    public Thread2 (Mydata d)
    {
        this.data = d ;
    }

    public void run ()
    {
        data.display("Welcome everyone !");
    }
    
}
public class synchronized_method 
{
    public static void main (String[] args)
    {
        Mydata data = new Mydata() ;

        Thread1 th1 = new Thread1(data);
        Thread2 th2 = new Thread2(data) ;

        th1.start(); 
        th2.start(); 

    }
    
}
