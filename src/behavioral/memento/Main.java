package behavioral.memento;

public class Main
{
    public static void main(String[] args)
    {
        ConfigurationCareTaker careTaker = new ConfigurationCareTaker();
        ConfigurationOriginator originator = new ConfigurationOriginator(5, 10);

        ConfigurationMemento snapShot1 = originator.createMemento();
        careTaker.addMemento(snapShot1);

        originator.setHeight(7);
        originator.setWidth(12);

        ConfigurationMemento snapShot2 = originator.createMemento();
        careTaker.addMemento(snapShot2);

        originator.setHeight(9);
        originator.setWidth(15);

        ConfigurationMemento restoredStateMemento = careTaker.undo();
        originator.restoreMemento(restoredStateMemento);
        System.out.println("Height: " + originator.getHeight() + ", Width: " + originator.getWidth());
    }
}
