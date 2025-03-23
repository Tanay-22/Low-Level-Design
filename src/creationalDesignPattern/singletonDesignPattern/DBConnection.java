package creationalDesignPattern.singletonDesignPattern;

public class DBConnection
{
    private static DBConnection instance = new DBConnection();

    private DBConnection()
    {
    }

    public static DBConnection getInstance()
    {
        if (instance == null)
        {
            synchronized (DBConnection.class)
            {
                if (instance == null)
                {
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }
}
