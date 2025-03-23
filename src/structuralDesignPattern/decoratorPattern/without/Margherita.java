package structuralDesignPattern.decoratorPattern.without;

import structuralDesignPattern.decoratorPattern.BasePizza;

public class Margherita extends BasePizza
{
    @Override
    public int cost()
    {
        return 100;
    }
}
