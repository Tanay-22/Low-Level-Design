package water_sort_puzzle;

import java.util.Stack;

public class Tube
{
    private final Stack<Color> stack;
    private static final int maxHeight = 4;

    public Tube()
    {
        this.stack = new Stack<>();
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public boolean isFull()
    {
        return stack.size() == maxHeight;
    }

    public Color peekColor()
    {
        return stack.peek();
    }

    public void pushColor(Color color)
    {
        if (!isFull())
            stack.push(color);
    }

    public Color popColor()
    {
        if (!isEmpty())
            return stack.pop();

        return null;
    }

    public void printTube(int i)
    {
        System.out.println(i + "-" + stack);
    }

    public boolean isCompleted()
    {
        if (!isFull())
            return false;

        Color topColor = peekColor();
        for (int i = 1; i < stack.size(); i++)
        {
            if (!topColor.equals(stack.get(i)))
                return false;
        }
        return true;
    }
}
