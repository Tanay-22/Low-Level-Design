package structural.flyweight.wordprocessor;

public class DocumentCharacter implements ILetter
{
    private char character;
    private String fontType;
    int size;


    public DocumentCharacter(char character, String fontType, int size)
    {
        this.character = character;
        this.fontType = fontType;
        this.size = size;
    }

    public char getCharacter()
    {
        return character;
    }

    public String getFontType()
    {
        return fontType;
    }

    public int getSize()
    {
        return size;
    }

    @Override
    public void display(int row, int column)
    {
        // display character at [row, column] with respective font and size
    }
}
