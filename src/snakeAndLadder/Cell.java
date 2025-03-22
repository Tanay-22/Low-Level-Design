package snakeAndLadder;

import snakeAndLadder.jump.Jump;

public class Cell
{
    private Jump jump;

    public Jump getJump()
    {
        return jump;
    }

    public void setJump(Jump jump)
    {
        this.jump = jump;
    }

    public boolean hasJump()
    {
        return jump != null;
    }
}
