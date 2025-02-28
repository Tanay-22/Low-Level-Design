package decoratorpattern.without;

import decoratorpattern.BasePizza;

public class Margherita extends BasePizza
{
    @Override
    public int cost()
    {
        return 100;
    }
}
