package creational.object_pool;

import java.util.ArrayList;
import java.util.List;

public class DBConnectionPoolManager
{
    private final List<DBConnection> freeConnectionsInPool;
    private final List<DBConnection> connectionsCurrentlyInUse;
    private final int INITIAL_POOL_SIZE = 3;
    private final int MAX_POOL_SIZE = 6;

    public DBConnectionPoolManager()
    {
        this.freeConnectionsInPool = new ArrayList<>();
        this.connectionsCurrentlyInUse = new ArrayList<>();
        for (int i = 0; i < INITIAL_POOL_SIZE; i++)
        {
            freeConnectionsInPool.add(new DBConnection());
        }
    }

    public DBConnection getDBConnection()
    {
        if (freeConnectionsInPool.isEmpty() && connectionsCurrentlyInUse.size() < MAX_POOL_SIZE)
        {
            freeConnectionsInPool.add(new DBConnection());
            System.out.println("Creating new connection and putting into the pool, free pool size: " +
                    freeConnectionsInPool.size());
        }
        else if (freeConnectionsInPool.isEmpty() && connectionsCurrentlyInUse.size() >= MAX_POOL_SIZE)
        {
            System.out.println("Cannot create new DBConnection, as max limit is reached");
            return null;
        }
        DBConnection dbConnection = freeConnectionsInPool.remove(freeConnectionsInPool.size() - 1);
        connectionsCurrentlyInUse.add(dbConnection);
        System.out.println("Adding DBConnection into Use pool, size: " + connectionsCurrentlyInUse.size());
        return dbConnection;
    }

    public void releaseDBConnection(DBConnection dbConnection)
    {
        if (dbConnection != null)
        {
            connectionsCurrentlyInUse.remove(dbConnection);
            System.out.println("Removing DBConnection from Use pool, size: " + connectionsCurrentlyInUse.size());
            freeConnectionsInPool.add(dbConnection);
            System.out.println("Adding DBConnection into Free pool, size: " + freeConnectionsInPool.size());
        }
    }
}
