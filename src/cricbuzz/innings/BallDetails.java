package cricbuzz.innings;

import cricbuzz.score_updater.BattingScoreUpdater;
import cricbuzz.score_updater.BowlingScoreUpdater;
import cricbuzz.score_updater.ScoreUpdaterObserver;
import cricbuzz.team.Team;
import cricbuzz.team.Wicket;
import cricbuzz.team.WicketType;
import cricbuzz.team.player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BallDetails
{
    private int ballNumber;
    private BallType ballType;
    private RunType runType;
    private Player playedBy;
    private Player bowledBy;
    private Wicket wicket;
    private List<ScoreUpdaterObserver> scoreUpdateObservers;
    private Random random;


    public BallDetails(int ballNumber)
    {
        this.ballNumber = ballNumber;
        scoreUpdateObservers = new ArrayList<>();
        scoreUpdateObservers.add(new BowlingScoreUpdater());
        scoreUpdateObservers.add(new BattingScoreUpdater());
        random = new Random();
    }

    public void startBallDelivery(Team battingTeam, Team bowlingTeam, OverDetails over)
    {
        playedBy = battingTeam.getStriker();
        this.bowledBy = over.getBowledBy();

        ballType = decideBallType();

        if (isWicketTaken())
        {
            runType = RunType.ZERO;
            wicket = new Wicket(WicketType.CATCH_OUT, bowlingTeam.getCurrentBowler(), over, this);
            battingTeam.setStriker(null);
        }
        else
        {
            runType = setRunType();
            if (runType.equals(RunType.ONE) || runType.equals(RunType.THREE))
            {
                // swap strike
                Player temp = battingTeam.getStriker();
                battingTeam.setStriker(battingTeam.getNonStriker());
                battingTeam.setNonStriker(temp);
            }
        }
        // update player scoreboard
        notifyUpdaters(this);
    }

    private BallType decideBallType()
    {
        int num = random.nextInt(100);
        if (num > 95)
            return BallType.NO_BALL;
        if (num > 75)
            return BallType.WIDE_BALL;

        return BallType.NORMAL;
    }

    private boolean isWicketTaken()
    {
        return random.nextInt(10) < 2;
    }

    private RunType setRunType()
    {
        int num = random.nextInt(100);

        if (num <= 15)
            return RunType.ZERO;

        if (num <= 30)
            return RunType.ONE;
        if (num <= 60)
            return RunType.TWO;
        if (num <= 90)
            return RunType.FOUR;

        return RunType.SIX;
    }

    private void notifyUpdaters(BallDetails ballDetails)
    {
        for (ScoreUpdaterObserver observer: scoreUpdateObservers)
        {
            observer.update(ballDetails);
        }
    }

    // getters

    public int getBallNumber()
    {
        return ballNumber;
    }

    public BallType getBallType()
    {
        return ballType;
    }

    public RunType getRunType()
    {
        return runType;
    }

    public Player getPlayedBy()
    {
        return playedBy;
    }

    public Player getBowledBy()
    {
        return bowledBy;
    }

    public Wicket getWicket()
    {
        return wicket;
    }

    public List<ScoreUpdaterObserver> getScoreUpdateObservers()
    {
        return scoreUpdateObservers;
    }
}
