package snakeAndLadder;

import snakeAndLadder.jump.Ladder;
import snakeAndLadder.jump.Snake;

import java.util.ArrayDeque;
import java.util.Deque;

public class Runner
{
    public static void main(String[] args)
    {
        int boardSize = 10; // 10x10 board
        int numberOfPlayers = 2; // You can change number of players

        // Initialize players
        Deque<Player> players = new ArrayDeque<>();
        for (int i = 1; i <= numberOfPlayers; i++)
        {
            players.add(new Player(i));
        }
        // Initialize game
        Game game = new Game(players, boardSize);
        playGame(game, boardSize);
    }

    private static void playGame(Game game, int boardSize)
    {
        boolean isGameOver = false;
        int totalCells = boardSize * boardSize;

        System.out.println("Game Started with Board size: " + boardSize + "x" + boardSize);
        System.out.println("-----------------------------------------");

        while (!isGameOver)
        {
            Player currentPlayer = game.players.poll(); // Get current player
            System.out.println("Player " + currentPlayer.getId() + "'s turn");

            int diceRoll = game.getDice().roll(); // Roll dice
            System.out.println("Dice rolled: " + diceRoll);

            int nextPosition = currentPlayer.getCurrentPosition() + diceRoll;

            if (nextPosition > totalCells)
            {
                System.out.println("Move exceeds board limit. Staying at same position: " + currentPlayer.getCurrentPosition());
            }
            else
            {
                currentPlayer.setCurrentPosition(nextPosition);
                System.out.println("Moved to position: " + currentPlayer.getCurrentPosition());

                // Check for snake or ladder
                Cell cell = game.getBoard().getCellFromNumber(nextPosition);
                if (cell != null && cell.hasJump())
                {
                    if (cell.getJump() instanceof Ladder)
                    {
                        System.out.println("Ladder found! Climbing up from " + cell.getJump().getStart() + " to " + cell.getJump().getEnd());
                    }
                    else if (cell.getJump() instanceof Snake)
                    {
                        System.out.println("Snake found! Sliding down from " + cell.getJump().getStart() + " to " + cell.getJump().getEnd());
                    }
                    currentPlayer.setCurrentPosition(cell.getJump().getEnd());
                }

                System.out.println("Current Position after move: " + currentPlayer.getCurrentPosition());

                // Check winning condition
                if (currentPlayer.getCurrentPosition() == totalCells)
                {
                    System.out.println("Player " + currentPlayer.getId() + " wins the game!");
                    game.winner = currentPlayer;
                    isGameOver = true;
                }
            }

            System.out.println("-----------------------------------------");

            // If no winner, add player back to queue
            if (!isGameOver)
            {
                game.players.add(currentPlayer);
            }
        }
    }
}
