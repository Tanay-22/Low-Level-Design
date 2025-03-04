package tictactoe.model;

import tictactoe.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Board
{
    private int size;
    private PlayingPiece[][] board;

    public Board(int size)
    {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int column, PlayingPiece playingPiece)
    {
        if(board[row][column] != null)
            return false;

        board[row][column] = playingPiece;
        return true;
    }

    public List<Pair<Integer, Integer>> getFreeCells()
    {
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                if(board[i][j] == null)
                {
                    freeCells.add(new Pair<>(i, j));
                }
            }
        }
        return freeCells;
    }

    public void printBoard()
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                if(board[i][j] != null)
                {
                    System.out.print(board[i][j].getPieceType().name() + " ");
                }
                else
                {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public PlayingPiece[][] getBoard()
    {
        return board;
    }

    public void setBoard(PlayingPiece[][] board)
    {
        this.board = board;
    }
}
