package structuralDesignPattern.bridgeDesignPattern;

public class TV implements Device
{
    private int volume = 10;

    @Override
    public void turnOn()
    {
        System.out.println("TV is turned ON");
    }

    @Override
    public void turnOff()
    {
        System.out.println("TV is turned OFF");
    }

    @Override
    public void setVolume(int volume)
    {
        this.volume = volume;
        System.out.println("TV volume set to " + this.volume);
    }
}
