package cricbuzz.innings;

import cricbuzz.match.MatchType;
import cricbuzz.team.Team;
import cricbuzz.team.player.Player;

import java.util.ArrayList;
import java.util.List;

public class InningDetails
{
    private Team battingTeam;
    private Team bowlingTeam;
    private MatchType matchType;
    private List<OverDetails> overs;

    public InningDetails(Team battingTeam, Team bowlingTeam, MatchType matchType)
    {
        this.battingTeam = battingTeam;
        this.bowlingTeam = bowlingTeam;
        this.matchType = matchType;
        overs = new ArrayList<>();
    }

    public void start(int runsToWin) throws Exception
    {
        // choose batsman
        battingTeam.chooseNextBatsman();
        int noOfOvers = matchType.getTotalNoOfOvers();
        for (int overNumber = 1; overNumber <= noOfOvers; overNumber++)
        {
            // choose bowler
            bowlingTeam.chooseNextBowler(matchType.getNoOfOversPerBowler());
            OverDetails over = new OverDetails(overNumber, bowlingTeam.getCurrentBowler());
            overs.add(over);
            boolean won = over.startOver(battingTeam, bowlingTeam, runsToWin);
            if (won)
            {
                break;
            }
            //swap striker and non striker after over
            Player temp = battingTeam.getStriker();
            battingTeam.setStriker(battingTeam.getNonStriker());
            battingTeam.setNonStriker(temp);
        }
    }

    public int getTotalRuns()
    {
        return battingTeam.getTotalRuns();
    }
}
