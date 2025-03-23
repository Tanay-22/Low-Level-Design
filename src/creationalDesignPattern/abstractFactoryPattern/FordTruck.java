package creationalDesignPattern.abstractFactoryPattern;

public class FordTruck implements Vehicle
{
    @Override
    public void drive()
    {
        System.out.println("Ford truck is driving");
    }

    @Override
    public void stop()
    {
        System.out.println("Ford truck has stopped");
    }
}