package decoratorpattern.without;

import decoratorpattern.BasePizza;

public class VegDelight extends BasePizza
{
    @Override
    public int cost()
    {
        return 120;
    }
}
