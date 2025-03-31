package structural.flyweight;

public class HumanoidRobot implements Robot
{
    private String type;
    private Sprites body;

    public HumanoidRobot(String type, Sprites body)
    {
        this.type = type;
        this.body = body;
    }

    public String getType()
    {
        return type;
    }

    public Sprites getBody()
    {
        return body;
    }

    @Override
    public void display(int x, int y)
    {

    }
}
