package book_my_show.model;

import java.util.Random;

public class Payment
{
    private final int id;
    private final Random random;

    public Payment(int id)
    {
        random = new Random();
        this.id = random.nextInt(1000);
    }

    public int getId()
    {
        return id;
    }
}
