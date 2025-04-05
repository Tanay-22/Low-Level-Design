package cricbuzz.team.player.score;

import cricbuzz.team.player.Player;

import java.util.*;

public class BowlingController
{
    private Deque<Player> bowlers;
    private Map<Player, Integer> bowlerWiseOverCount;
    private Player currentBowler;

    public BowlingController(List<Player> bowlers)
    {
        setBowlers(bowlers);
    }

    private void setBowlers(List<Player> bowlers)
    {
        this.bowlers = new ArrayDeque<>();
        bowlerWiseOverCount = new HashMap<>();
        for (Player bowler: bowlers)
        {
            this.bowlers.offer(bowler);
            bowlerWiseOverCount.put(bowler, 0);
        }
    }

    public void getNextBowler(int maxOverCountPerBowler)
    {
        Player player = bowlers.poll();
        if (bowlerWiseOverCount.get(player) + 1 == maxOverCountPerBowler)
        {
            currentBowler = player;
        }
        else
        {
            currentBowler = player;
            bowlers.offer(player);
            bowlerWiseOverCount.put(player, bowlerWiseOverCount.get(player) + 1);
        }
    }

    public Player getCurrentBowler()
    {
        return currentBowler;
    }
}
