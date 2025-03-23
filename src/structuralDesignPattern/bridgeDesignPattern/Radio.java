package structuralDesignPattern.bridgeDesignPattern;

public class Radio implements Device
{
    private int volume = 5;

    @Override
    public void turnOn()
    {
        System.out.println("Radio is turned ON");
    }

    @Override
    public void turnOff()
    {
        System.out.println("Radio is turned OFF");
    }

    @Override
    public void setVolume(int volume)
    {
        this.volume = volume;
        System.out.println("Radio volume set to " + this.volume);
    }
}
