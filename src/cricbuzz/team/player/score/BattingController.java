package cricbuzz.team.player.score;

import cricbuzz.team.player.Player;

import java.util.ArrayDeque;
import java.util.Queue;

public class BattingController
{
    private final Queue<Player> yetToPlay;
    private Player striker;
    private Player nonStriker;

    public BattingController(Queue<Player> playing11)
    {
        this.yetToPlay = new ArrayDeque<>();
        this.yetToPlay.addAll(playing11);
    }

    public void getNextPlayer() throws Exception
    {
        if (yetToPlay.isEmpty())
        {
            throw new Exception();
        }
        if (striker == null)
        {
            striker = yetToPlay.poll();
        }
        if (nonStriker == null)
        {
            nonStriker = yetToPlay.poll();
        }
    }

    public Queue<Player> getYetToPlay()
    {
        return yetToPlay;
    }

    public Player getStriker()
    {
        return striker;
    }

    public void setStriker(Player striker)
    {
        this.striker = striker;
    }

    public Player getNonStriker()
    {
        return nonStriker;
    }

    public void setNonStriker(Player nonStriker)
    {
        this.nonStriker = nonStriker;
    }
}
