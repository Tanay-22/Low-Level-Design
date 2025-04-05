package behavioral.interpreter;

public class SumNonTerminalExpression implements AbstractExpression
{
    private final AbstractExpression leftExpression;
    private final AbstractExpression rightExpression;

    public SumNonTerminalExpression(AbstractExpression leftExpression, AbstractExpression rightExpression)
    {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret(Context context)
    {
        return leftExpression.interpret(context) + rightExpression.interpret(context);
    }
}
