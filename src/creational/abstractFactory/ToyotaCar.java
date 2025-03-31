package creational.abstractFactory;

public class ToyotaCar implements Vehicle
{
    @Override
    public void drive()
    {
        System.out.println("Toyota car is driving");
    }

    @Override
    public void stop()
    {
        System.out.println("Toyota car has stopped");
    }
}