package snakeAndLadder;


import java.util.concurrent.ThreadLocalRandom;

public class Dice
{
    private int diceCount;

    public Dice(int diceCount)
    {
        this.diceCount = diceCount;
    }

    public int roll()
    {
        int totalSum = 0;
        int diceUsed = 0;
        while (diceUsed++ < diceCount)
        {
            totalSum += ThreadLocalRandom.current().nextInt(1, 7);
        }
        return totalSum;
    }
}
