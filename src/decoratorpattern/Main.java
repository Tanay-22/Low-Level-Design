package decoratorpattern;

import decoratorpattern.with.ExtraCheese;
import decoratorpattern.with.Mushroom;
import decoratorpattern.without.Margherita;
import decoratorpattern.without.VegDelight;

public class Main
{
    public static void main(String[] args)
    {
        // margherita + extra cheese
        BasePizza margherita = new ExtraCheese(new Margherita());
        System.out.println(margherita.cost());

        // veg delight + mushroom
        BasePizza vegDelight = new Mushroom(new VegDelight());
        System.out.println(vegDelight.cost());

        // margherita + extra cheese + mushrooms
        BasePizza customPizza = new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println(customPizza.cost());
    }
}
