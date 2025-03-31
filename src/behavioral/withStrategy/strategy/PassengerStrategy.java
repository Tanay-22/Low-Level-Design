package behavioral.withStrategy.strategy;

public class PassengerStrategy implements DriveStrategy
{

    @Override
    public void drive()
    {
        System.out.println("Normal drive strategy");
    }
}
