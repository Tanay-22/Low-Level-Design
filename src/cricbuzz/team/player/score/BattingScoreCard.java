package cricbuzz.team.player.score;

import cricbuzz.team.Wicket;

public class BattingScoreCard
{

    private int runs;
    private int ballsPlayed;
    private int fours;
    private int sixes;
    private double strikeRate;
    private Wicket wickets;

    public BattingScoreCard()
    {
        this.runs = 0;
        this.ballsPlayed = 0;
        this.fours = 0;
        this.sixes = 0;
        this.strikeRate = 0.0;
        this.wickets = null;
    }

    public int getRuns()
    {
        return runs;
    }

    public void increaseRuns(int runs)
    {
        this.runs += runs;
    }

    public int getBallsPlayed()
    {
        return ballsPlayed;
    }

    public void increaseBallsPlayed()
    {
        this.ballsPlayed++;
    }

    public int getFours()
    {
        return fours;
    }

    public void increaseFours()
    {
        this.fours++;
    }

    public int getSixes()
    {
        return sixes;
    }

    public void increaseSixes()
    {
        this.sixes++;
    }

    public double getStrikeRate()
    {
        return strikeRate;
    }

    public Wicket getWickets()
    {
        return wickets;
    }

    public void setWickets(Wicket wickets)
    {
        this.wickets = wickets;
    }
}
