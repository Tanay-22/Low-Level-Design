package snakeAndLadder;

import snakeAndLadder.jump.Ladder;
import snakeAndLadder.jump.Snake;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Board
{
    private final Cell[][] cells;
    private final int n;

    public Board(int n)
    {
        this.n = n;
        this.cells = new Cell[n][n];
        initializeCells();
        placeSnakesAndLadders();
    }

    private void initializeCells()
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                cells[i][j] = new Cell();
            }
        }
    }

    public Cell[][] getCells()
    {
        return cells;
    }

    public Cell getCellFromNumber(int num)
    {
        int rowFromBottom = (num - 1) / n;
        int actualRow = n - 1 - rowFromBottom;
        int col;

        if (rowFromBottom % 2 == 0)
        { // left to right
            col = (num - 1) % n;
        }
        else
        { // right to left
            col = n - 1 - ((num - 1) % n);
        }
        return cells[actualRow][col];
    }

    private void placeSnakesAndLadders()
    {
        int totalCells = n * n;
        int totalSnakes = totalCells / 10;
        int totalLadders = totalCells / 10;

        Random random = new Random();
        Set<Integer> usedPositions = new HashSet<>();

        // Place ladders
        for (int i = 0; i < totalLadders; )
        {
            int start = random.nextInt(totalCells - 1) + 1; // avoid cell 0
            int end = random.nextInt(totalCells - start) + start + 1; // end > start

            if (usedPositions.contains(start) || usedPositions.contains(end))
                continue;

            Ladder ladder = new Ladder(start, end);
            getCellFromNumber(start).setJump(ladder);
            usedPositions.add(start);
            usedPositions.add(end);
            i++;
        }
        // Place snakes
        for (int i = 0; i < totalSnakes; )
        {
            int start = random.nextInt(totalCells - 1) + 1; // avoid cell 0
            int end = random.nextInt(start - 1) + 1; // end < start

            if (usedPositions.contains(start) || usedPositions.contains(end))
                continue;

            Snake snake = new Snake(start, end);
            getCellFromNumber(start).setJump(snake);
            usedPositions.add(start);
            usedPositions.add(end);
            i++;
        }
    }
}
