package water_sort_puzzle;

public class Move
{
    private final int from;
    private final int to;
    private final Color color;
    private final int count;

    public Move(int from, int to, Color color, int count)
    {
        this.from = from;
        this.to = to;
        this.color = color;
        this.count = count;
    }

    public int getFrom()
    {
        return from;
    }

    public int getTo()
    {
        return to;
    }

    public Color getColor()
    {
        return color;
    }

    public int getCount()
    {
        return count;
    }
}
