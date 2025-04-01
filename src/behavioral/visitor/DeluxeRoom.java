package behavioral.visitor;

public class DeluxeRoom implements Room
{
    public int roomPrice = 0;

    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}
