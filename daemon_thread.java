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
public class daemon_thread 
{
    public static void main (String[] args)
    {
        MyThread t = new MyThread() ;
        t.setDaemon(true);
        t.start(); 
       

    }
    
}
