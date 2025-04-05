package behavioral.interpreter;

public class Client
{
    public static void main(String[] args)
    {
        Context context = new Context();
        context.put("a", 2);
        context.put("b", 4);
        context.put("c", 8);
        context.put("d", 16);

        // a * b
        AbstractExpression expression1 = new MultiplyNonTerminalExpression(new NumberTerminalExpression("a"),
                new NumberTerminalExpression("b"));

        System.out.println(expression1.interpret(context));

        // (a * b) + (c * d)
        AbstractExpression expression2 = new SumNonTerminalExpression(expression1, new MultiplyNonTerminalExpression(
                new NumberTerminalExpression("c"),
                new NumberTerminalExpression("d")
        ));

        System.out.println(expression2.interpret(context));
    }
}
