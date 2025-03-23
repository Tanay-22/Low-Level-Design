package structuralDesignPattern.decoratorPattern.without;

import structuralDesignPattern.decoratorPattern.BasePizza;

public class FarmHousePizza extends BasePizza
{
    @Override
    public int cost()
    {
        return 200;
    }
}
