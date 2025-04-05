package cricbuzz.team;

import cricbuzz.team.player.Player;
import cricbuzz.team.player.score.BattingController;
import cricbuzz.team.player.score.BowlingController;

import java.util.List;
import java.util.Queue;

public class Team
{
    private String name;
    private Queue<Player> playing11;
    private List<Player> benchPlayers;
    private BattingController battingController;
    private BowlingController bowlingController;
    private boolean isWinner;

    public Team(String name, Queue<Player> playing11, List<Player> benchPlayers, List<Player> bowlers)
    {
        this.name = name;
        this.playing11 = playing11;
        this.benchPlayers = benchPlayers;
        battingController = new BattingController(playing11);
        bowlingController = new BowlingController(bowlers);
    }

    public String getName()
    {
        return name;
    }

    public List<Player> getBenchPlayers()
    {
        return benchPlayers;
    }

    public Queue<Player> getPlaying11()
    {
        return playing11;
    }

    public boolean isWinner()
    {
        return isWinner;
    }

    public void setWinner(boolean winner)
    {
        isWinner = winner;
    }

    public void chooseNextBatsman() throws Exception
    {
        battingController.getNextPlayer();
    }

    public void chooseNextBowler(int maxOverCountPerBowler) throws Exception
    {
        bowlingController.getNextBowler(maxOverCountPerBowler);
    }

    public Player getStriker()
    {
        return battingController.getStriker();
    }

    public Player getNonStriker()
    {
        return battingController.getNonStriker();
    }

    public void setStriker(Player player)
    {
        battingController.setStriker(player);
    }

    public void setNonStriker(Player player)
    {
        battingController.setNonStriker(player);
    }

    public Player getCurrentBowler()
    {
        return bowlingController.getCurrentBowler();
    }

    public void printBattingScoreCard()
    {

        for (Player player : playing11)
        {
            player.printBattingScoreCard();
        }
    }

    public void printBowlingScoreCard()
    {

        for (Player player : playing11)
        {
            if (player.getBowlingScoreCard().getBallsBowled() > 0)
            {
                player.printBowlingScoreCard();
            }
        }
    }

    public int getTotalRuns()
    {
        int totalRun = 0;
        for (Player player : playing11)
        {
            totalRun += player.getBattingScoreCard().getRuns();
        }
        return totalRun;
    }

}
