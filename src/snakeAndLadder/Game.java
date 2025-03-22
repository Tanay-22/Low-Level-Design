package snakeAndLadder;

import java.util.Deque;

public class Game
{
    private final Board board;
    private final Dice dice;
    Deque<Player> players;
    Player winner;

    public Game(Deque<Player> players, int n)
    {
        board = new Board(n);
        dice = new Dice(1);
        this.players = players;
    }

    public Board getBoard()
    {
        return board;
    }

    public Dice getDice()
    {
        return dice;
    }

    public Deque<Player> getPlayers()
    {
        return players;
    }

    public Player getWinner()
    {
        return winner;
    }
}
