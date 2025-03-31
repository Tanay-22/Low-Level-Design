package behavioral.command;

import java.util.Stack;

public class RemoteControl
{
    private Command command;
    private Stack<Command> commandHistory;

    public RemoteControl()
    {
        this.commandHistory = new Stack<>();
    }

    public void setCommand(Command command)
    {
        this.command = command;
    }

    public void pressButton()
    {
        command.execute();
        commandHistory.push(command);
    }

    public void undo()
    {
        if (!commandHistory.isEmpty())
        {
            commandHistory.pop().undo();
        }
    }
}
