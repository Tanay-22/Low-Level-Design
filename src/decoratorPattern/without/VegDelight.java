package decoratorPattern.without;

import decoratorPattern.BasePizza;

public class VegDelight extends BasePizza
{
    @Override
    public int cost()
    {
        return 120;
    }
}
