class MyThread extends Thread 
{
    @Override
    public void run()
    {
        int count = 1 ;
        while(true)
        {
            System.out.println(count++);
        }
    }
}
public class join_thread 
{
    public static void main (String[] args) throws InterruptedException
    {
        MyThread t = new MyThread() ;
        t.setDaemon(true);
        t.start(); 
        Thread t2 = Thread.currentThread();
        t2.join() ;


    }
    
}
