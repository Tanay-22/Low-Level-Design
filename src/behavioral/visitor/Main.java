package behavioral.visitor;

public class Main
{
    public static void main(String[] args)
    {
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room deluxeRoom = new DeluxeRoom();

        Visitor pricingVisitor = new PricingVisitor();

        singleRoom.accept(pricingVisitor);
        System.out.println(((SingleRoom)singleRoom).roomPrice);

        doubleRoom.accept(pricingVisitor);
        System.out.println(((DoubleRoom)doubleRoom).roomPrice);

        deluxeRoom.accept(pricingVisitor);
        System.out.println(((DeluxeRoom)deluxeRoom).roomPrice);

        Visitor maintenanceVisitor = new MaintenanceVisitor();
        singleRoom.accept(maintenanceVisitor);
        doubleRoom.accept(maintenanceVisitor);
        deluxeRoom.accept(maintenanceVisitor);
    }
}
