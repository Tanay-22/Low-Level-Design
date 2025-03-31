package behavioral.command;

public class TurnAcOffCommand implements Command
{
    private AirConditioner ac;

    @Override
    public void execute()
    {
        ac.turnOffAc();
    }

    @Override
    public void undo()
    {
        ac.turnOnAc();
    }
}
