class ATM 
{
    synchronized public void check_balance (String name)
    {
        System.out.println(name+" is checking his/her balance !");
        try{
            Thread.sleep(100);
       }

       catch (Exception e )
       {
           System.out.println(e);
       }
    }

    synchronized public void withdraw_balance(String name , int amount)
    {
        System.out.println(name+" is withdrawing his balance and the amount is : "+amount);
        try{
             Thread.sleep(100);
        }

        catch (Exception e )
        {
            System.out.println(e);
        }
    }
}

class Customer extends Thread
{
    ATM atm ;
    String name ;
    int amount ;

    public Customer (String n , int amt , ATM a)
    {
       name = n ;
        amount = amt ;
        atm = a ;
        
    }

    public void useATM ()
    {
        atm.check_balance(name) ;
        atm.withdraw_balance(name , amount) ;
    }

    public void run ()
    {
        useATM();
    }
}
public class ATM_Machine
{
    public static void main (String[] args)
    {
        ATM atm = new ATM() ;
        Customer c1 = new Customer("Anushree", 1000, atm);
        Customer c2 = new Customer("Debashree", 20000, atm);
        c1.start(); 
        c2.start();
         

    }
    
}
