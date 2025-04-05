package behavioral.interpreter;

public class NumberTerminalExpression implements AbstractExpression
{
    private final String stringValue;

    public NumberTerminalExpression(String stringValue)
    {
        this.stringValue = stringValue;
    }

    @Override
    public int interpret(Context context)
    {
        return context.get(stringValue);
    }
}
