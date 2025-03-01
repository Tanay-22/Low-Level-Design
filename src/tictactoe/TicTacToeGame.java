package tictactoe;

import tictactoe.model.*;
import tictactoe.util.Pair;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame
{
    private Deque<Player> players;
    private Board gameBoard;

    public TicTacToeGame()
    {
        initializeGame();
    }

    private void initializeGame()
    {
        this.players = new ArrayDeque<>();
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player 1", crossPiece);

        PlayingPieceO noughtPiece = new PlayingPieceO();
        Player player2 = new Player("Player 2", noughtPiece);

        players.offer(player1);
        players.offer(player2);

        gameBoard = new Board(3);
    }

    public String startGame()
    {
        boolean noWinner = true;
        while (noWinner)
        {
            // take out the player whose turn is and also put the player in the back
            Player playerTurn = players.poll();

            // get the free space from the board
            gameBoard.printBoard();
            List<Pair<Integer, Integer>> freeSpaces = gameBoard.getFreeCells();
            if(freeSpaces.isEmpty())
            {
                noWinner = false;
                continue;
            }
            System.out.print("Player:" + playerTurn.getName() + " Enter row,column: ");
            Scanner scanner = new Scanner(System.in);
            String[] values = scanner.nextLine().split(",");
            int inputRow = Integer.parseInt(values[0]);
            int inputColumn = Integer.parseInt(values[1]);

            // place the piece
            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow, inputColumn, playerTurn.getPlayingPiece());
            if(!pieceAddedSuccessfully)
            {
                System.out.println("Incorrect position chosen, try again");
                players.offerFirst(playerTurn); // add at beginning
                continue;
            }
            players.offer(playerTurn); // add at end

            boolean winner  = isThereWinner(inputRow, inputColumn, playerTurn.getPlayingPiece().getPieceType());
            if(winner)
            {
                 return playerTurn.getName();
            }
        }
        return "TIE";
    }

    private boolean isThereWinner(int row, int column, PieceType pieceType)
    {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        int size = gameBoard.getSize();
        for(int i = 0, j = 0; i < size; i++, j++)
        {
            // check for row match
            if(gameBoard.getBoard()[row][i] == null || gameBoard.getBoard()[row][i].getPieceType() != pieceType)
            {
                rowMatch = false;
            }
            // check for column match
            if(gameBoard.getBoard()[i][column] == null || gameBoard.getBoard()[i][column].getPieceType() != pieceType)
            {
                columnMatch = false;
            }
            // check for diagonal match
            if(gameBoard.getBoard()[i][j] == null || gameBoard.getBoard()[i][j].getPieceType() != pieceType)
            {
                diagonalMatch = false;
            }
            // check for anti-diagonal match
            if(gameBoard.getBoard()[i][size - j - 1] == null || gameBoard.getBoard()[i][size - j - 1].getPieceType() != pieceType)
            {
                antiDiagonalMatch = false;
            }
        }
        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}