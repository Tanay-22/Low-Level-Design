package structuralDesignPattern.decoratorPattern.without;

import structuralDesignPattern.decoratorPattern.BasePizza;

public class VegDelight extends BasePizza
{
    @Override
    public int cost()
    {
        return 120;
    }
}
