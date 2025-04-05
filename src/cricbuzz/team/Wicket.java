package cricbuzz.team;

import cricbuzz.innings.BallDetails;
import cricbuzz.innings.OverDetails;
import cricbuzz.team.player.Player;

public class Wicket
{
    private WicketType wicketType;
    private Player takenBy;
    private OverDetails overDetails;
    private BallDetails ballDetails;

    public Wicket(WicketType wicketType, Player takenBy, OverDetails overDetails, BallDetails ballDetails)
    {
        this.wicketType = wicketType;
        this.takenBy = takenBy;
        this.overDetails = overDetails;
        this.ballDetails = ballDetails;
    }

    public WicketType getWicketType()
    {
        return wicketType;
    }

    public void setWicketType(WicketType wicketType)
    {
        this.wicketType = wicketType;
    }

    public Player getTakenBy()
    {
        return takenBy;
    }

    public void setTakenBy(Player takenBy)
    {
        this.takenBy = takenBy;
    }

    public OverDetails getOverDetails()
    {
        return overDetails;
    }

    public void setOverDetails(OverDetails overDetails)
    {
        this.overDetails = overDetails;
    }

    public BallDetails getBallDetails()
    {
        return ballDetails;
    }

    public void setBallDetails(BallDetails ballDetails)
    {
        this.ballDetails = ballDetails;
    }
}
