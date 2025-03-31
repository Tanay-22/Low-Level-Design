package behavioral.command;

public class TurnAcOnCommand implements Command
{
    private AirConditioner ac;

    public TurnAcOnCommand(AirConditioner ac)
    {
        this.ac = ac;
    }

    @Override
    public void execute()
    {
        ac.turnOnAc();
    }

    @Override
    public void undo()
    {
        ac.turnOffAc();
    }
}
