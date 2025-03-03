package chess.model;

public class Piece
{
    private PieceColor color;

    public Piece(PieceColor color)
    {
        this.color = color;
    }

    public PieceColor getColor()
    {
        return color;
    }

    public void setColor(PieceColor color)
    {
        this.color = color;
    }
}
