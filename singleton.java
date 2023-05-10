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

    private void fillcoffee(float coffee_qty)
    {
        coffeequantity = coffee_qty ;
    }

    private void fillwater(float water_qty)
    {
        waterquantity = water_qty ;
    }

    public float get_coffee()
    {
        return 0.05f ;
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
        System.out.println(c.get_coffee());


    }
    
}
