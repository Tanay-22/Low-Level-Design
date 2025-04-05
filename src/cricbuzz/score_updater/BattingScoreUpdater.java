package cricbuzz.score_updater;

import cricbuzz.innings.BallDetails;

public class BattingScoreUpdater implements ScoreUpdaterObserver
{
    @Override
    public void update(BallDetails ballDetails)
    {
        int run = 0;
        switch (ballDetails.getRunType())
        {
            case ONE:
                run = 1;
                break;

            case TWO:
                run = 2;
                break;

            case THREE:
                run = 3;
                break;

            case FOUR:
                run = 4;
                ballDetails.getPlayedBy().getBattingScoreCard().increaseFours();
                break;

            case SIX:
                run = 6;
                ballDetails.getPlayedBy().getBattingScoreCard().increaseSixes();
                break;
        }
        ballDetails.getPlayedBy().getBattingScoreCard().increaseBallsPlayed();

        if (ballDetails.getWicket() != null)
            ballDetails.getPlayedBy().getBattingScoreCard().setWickets(ballDetails.getWicket());
        else
            ballDetails.getPlayedBy().getBattingScoreCard().increaseRuns(run);
    }
}
