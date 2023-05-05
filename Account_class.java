import java.util.*;
class Account
{
    public int acc_no ;
    public String name ;
    public double balance ;

    public double setBalance(int amount)
    {
        if (amount > 0 )
        {
            balance = balance + amount ;
            return balance ;
        
        }
        else 
        {
            balance = balance - amount ;
            return balance;
        }
    }

    public double deposit (int amount)
    {
        balance = setBalance(amount) ;
        return balance ;   
    }

    public double withdraw (int amount)
    {
        balance = balance - amount ;
        return balance ;
       
    }

    public String getName ()
    {
        return name ;
    }

    public int getAccountNumber()
    {
        return acc_no ;
    }

    public double display()
    {
        return balance ;
    }
}
public class Account_class 
{

    /**
     * @param args
     */
    public static void main (String[] args)
    {
        System.out.println("Welcome to SBI !");
        System.out.println();
        Account ac = new Account() ;
        ac.acc_no = 397131275 ;
        ac.name = "Anushree Paul ";
        ac.balance = 2000 ;
        

        Scanner sc = new Scanner (System.in) ;

        System.out.println("user name : "+ac.getName());
        System.out.println();
        System.out.println("account_ no : "+ac.getAccountNumber());
        System.out.println();
        
        System.err.println("Facility available :  ");
        System.out.println("1. Deposit");
        System.out.println();
        System.out.println("2. Withdraw ");
        System.out.println();
        System.out.println("3: View Balance ");
        System.out.print("Enter the option : ");
        int option = sc.nextInt() ;
        switch(option)
        {
            case 1 : System.out.print("Enter the amount you want to deposit : ");
                     int amount = sc.nextInt() ;
                     System.out.print("The amount available in your account is : "+ac.deposit(amount));
                     System.exit(0);

            case 2 :    System.out.print("Enter the amount you want to withdraw : ");
                        int amount_2 = sc.nextInt() ;
                        System.out.print("The amount available in your account is : "+ac.withdraw(amount_2));
                        System.exit(0);
            
            case 3 :    System.out.println("Balance : "+ac.display());
                        System.exit(0);


        }

        sc.close();


    }
    

}
