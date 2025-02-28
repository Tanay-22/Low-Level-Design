package decoratorpattern.without;

import decoratorpattern.BasePizza;

public class FarmHousePizza extends BasePizza
{
    @Override
    public int cost()
    {
        return 200;
    }
}
