package chess.model;

public class Board
{
    private Cell[][] board;

    public Board()
    {
        initializeBoard();
    }

    private void initializeBoard()
    {
        board = new Cell[8][8];
        // pawns
        for (int i = 0; i < 8; i++)
        {
            board[1][i] = new Cell(new Pawn(PieceColor.BLACK));
            board[6][i] = new Cell(new Pawn(PieceColor.WHITE));
        }
        // bishops
        board[0][2] = new Cell(new Bishop(PieceColor.BLACK));
        board[0][5] = new Cell(new Bishop(PieceColor.BLACK));
        board[7][2] = new Cell(new Bishop(PieceColor.WHITE));
        board[7][5] = new Cell(new Bishop(PieceColor.WHITE));

        // knight
        board[0][1] = new Cell(new Knight(PieceColor.BLACK));
        board[0][6] = new Cell(new Knight(PieceColor.BLACK));
        board[7][1] = new Cell(new Knight(PieceColor.WHITE));
        board[7][6] = new Cell(new Knight(PieceColor.WHITE));

        // rooks
        board[0][0] = new Cell(new Rook(PieceColor.BLACK));
        board[0][7] = new Cell(new Rook(PieceColor.BLACK));
        board[7][0] = new Cell(new Rook(PieceColor.WHITE));
        board[7][7] = new Cell(new Rook(PieceColor.WHITE));

        // queen
        board[0][3] = new Cell(new Queen(PieceColor.BLACK));
        board[7][3] = new Cell(new Queen(PieceColor.WHITE));

        // king
        board[0][4] = new Cell(new King(PieceColor.BLACK));
        board[7][4] = new Cell(new King(PieceColor.WHITE));
    }
}
