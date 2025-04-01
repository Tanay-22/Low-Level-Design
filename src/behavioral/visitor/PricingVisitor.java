package behavioral.visitor;

public class PricingVisitor implements Visitor
{
    @Override
    public void visit(SingleRoom singleRoom)
    {
        System.out.println("Pricing computation logic of Single Room");
        singleRoom.roomPrice = 1000;
    }

    @Override
    public void visit(DoubleRoom doubleRoom)
    {
        System.out.println("Pricing computation logic of Double Room");
        doubleRoom.roomPrice = 2000;
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom)
    {
        System.out.println("Pricing computation logic of Deluxe Room");
        deluxeRoom.roomPrice = 5000;
    }
}
