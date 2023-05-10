class CoffeeMachine 
{
    private float coffeequantity ;
    private float waterquantity ;
    static private CoffeeMachine our = null ;

    private CoffeeMachine()
    {
        coffeequantity = 1 ;
        waterquantity = 1 ;
        
    }

    static public CoffeeMachine getinstance()
    {
        if (our == null)
        {
            our = new CoffeeMachine() ;

        }

        return our ;
    }


}
public class singleton 
{
    public static void main (String[] args)
    {
        CoffeeMachine c = CoffeeMachine.getinstance() ;
        System.out.println(c);

    }
    
}
