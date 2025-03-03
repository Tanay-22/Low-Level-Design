package nullObjectPattern;

public class Bike implements Vehicle
{
    @Override
    public int getTankCapacity()
    {
        return 20;
    }

    @Override
    public int getSeatingCapacity()
    {
        return 2;
    }
}
