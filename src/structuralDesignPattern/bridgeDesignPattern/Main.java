package structuralDesignPattern.bridgeDesignPattern;

public class Main
{
    public static void main(String[] args)
    {
        Device tv = new TV();
        Device radio = new Radio();

        RemoteControl tvRemote = new BasicRemoteControl(tv);
        RemoteControl radioRemote = new AdvancedRemoteControl(radio);

        System.out.println("Using TV Remote:");
        tvRemote.turnOn();
        tvRemote.setVolume(20);
        tvRemote.turnOff();

        System.out.println("\nUsing Advanced Radio Remote:");
        radioRemote.turnOn();
        radioRemote.setVolume(15);
        ((AdvancedRemoteControl) radioRemote).mute();
        radioRemote.turnOff();
    }
}
