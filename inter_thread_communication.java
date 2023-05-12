class Mydata 
{
    int value = 0 ;
    boolean flag = false ;

    synchronized void set (int v)
    {
        while (flag != true)
        {
            try
            {
                wait() ;

            }

            catch (Exception e)
            {}
        }
        
         value = v ;
         flag = false ;
         notify();

    }

    synchronized int get ()
    {
        int x = 0 ;
        while (flag != false)
        {
            try
            {
                wait();

            }
            catch(Exception e)
            {

            }
            
        }
        value = x ;
        flag = true;
        notify();

        return x ;
    }
}

class Producer extends Thread 
{
    Mydata data ;
    
    public Producer (Mydata d)
    {
        data = d ;
    }

    public void run ()
    {
        int count = 1 ;

        while (true)
        {
            data.set(count);
            System.out.println("Producer : "+count);
            count++ ;
        }

    }
}

class Consumer extends Thread 
{
    Mydata data ;

    public Consumer (Mydata d)
    {
        data = d ;
    }

    public void run ()
    {
        while (true)
        {
            System.out.println("Consumer : "+data.get());
        }
    }
}

public class inter_thread_communication 
{
    public static void main (String[] args)
    {
        Mydata data = new Mydata() ;
        Producer p = new Producer(data) ;
        Consumer c = new Consumer(data) ;

        p.start(); 
        c.start();
    }
}