package behavioral.visitor;

public class SingleRoom implements Room
{
    public int roomPrice = 0;

    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}
