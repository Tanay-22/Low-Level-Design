package cricbuzz.score_updater;

import cricbuzz.innings.BallDetails;
import cricbuzz.innings.BallType;

public class BowlingScoreUpdater implements ScoreUpdaterObserver
{
    @Override
    public void update(BallDetails ballDetails)
    {
        if (ballDetails.getBallType().equals(BallType.WIDE_BALL))
        {
            ballDetails.getBowledBy().getBowlingScoreCard().increaseRunsGiven(1);
            ballDetails.getBowledBy().getBowlingScoreCard().increaseWideBallsCount();
            return;
        }
        switch (ballDetails.getRunType())
        {
            case ONE -> ballDetails.getBowledBy().getBowlingScoreCard().increaseRunsGiven(1);
            case TWO -> ballDetails.getBowledBy().getBowlingScoreCard().increaseRunsGiven(2);
            case THREE -> ballDetails.getBowledBy().getBowlingScoreCard().increaseRunsGiven(3);
            case FOUR -> ballDetails.getBowledBy().getBowlingScoreCard().increaseRunsGiven(4);
            case FIVE -> ballDetails.getBowledBy().getBowlingScoreCard().increaseRunsGiven(6);
        }
        if (ballDetails.getBallType().equals(BallType.NORMAL))
        {
            ballDetails.getBowledBy().getBowlingScoreCard().increaseBallsBowled();
            if (ballDetails.getWicket() != null)
            {
                ballDetails.getBowledBy().getBowlingScoreCard().increaseWicketsTaken();
            }
        }
        else if (ballDetails.getBallType().equals(BallType.NO_BALL))
        {
            ballDetails.getBowledBy().getBowlingScoreCard().increaseNoBallsCount();
        }
    }
}
