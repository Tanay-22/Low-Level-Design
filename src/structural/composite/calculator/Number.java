package structural.composite.calculator;

public class Number implements ArithmeticExpression
{
    private int value;

    public Number(int value)
    {
        this.value = value;
    }

    @Override
    public int evaluate()
    {
        return value;
    }
}
