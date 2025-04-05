package cricbuzz.team.player.score;


public class BowlingScoreCard
{

    private int ballsBowled; // total balls count rather than overs for better displaying
    private int runsGiven;
    private int wicketsTaken;
    private int noBallsCount;
    private int wideBallsCount;
    private double economyRate;

    public int getBallsBowled()
    {
        return ballsBowled;
    }

    public void increaseBallsBowled()
    {
        this.ballsBowled++;
    }

    public int getRunsGiven()
    {
        return runsGiven;
    }

    public void increaseRunsGiven(int runsGiven)
    {
        this.runsGiven += runsGiven;
    }

    public int getWicketsTaken()
    {
        return wicketsTaken;
    }

    public void increaseWicketsTaken()
    {
        this.wicketsTaken++;
    }

    public int getNoBallsCount()
    {
        return noBallsCount;
    }

    public void increaseNoBallsCount()
    {
        this.noBallsCount++;
    }

    public int getWideBallsCount()
    {
        return wideBallsCount;
    }

    public void increaseWideBallsCount()
    {
        this.wideBallsCount++;
    }

    public double getEconomyRate()
    {
        return economyRate;
    }

    public void setEconomyRate(double economyRate)
    {
        this.economyRate = economyRate;
    }

}
