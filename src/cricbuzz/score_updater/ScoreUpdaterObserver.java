package cricbuzz.score_updater;

import cricbuzz.innings.BallDetails;

public interface ScoreUpdaterObserver
{
    void update(BallDetails ballDetails);
}
