package nullObjectPattern;

public class NullVehicle implements Vehicle
{
    @Override
    public int getTankCapacity()
    {
        return Integer.MIN_VALUE;
    }

    @Override
    public int getSeatingCapacity()
    {
        return Integer.MIN_VALUE;
    }
}
