package behavioral.visitor;

public class MaintenanceVisitor implements Visitor
{
    @Override
    public void visit(SingleRoom singleRoom)
    {
        System.out.println("Performing maintenance of Single Room");
    }

    @Override
    public void visit(DoubleRoom doubleRoom)
    {
        System.out.println("Performing maintenance of Double Room");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom)
    {
        System.out.println("Performing maintenance of Deluxe Room");
    }
}
