package P159_Exe6_4_Database;

import java.util.concurrent.atomic.AtomicInteger;

public class RetrieveThread extends Thread
{
    private final Database<String, String> database;
    private final String key;
    private static final AtomicInteger atomicCounter = new AtomicInteger(0);

    public RetrieveThread(Database<String, String> database, String key)
    {
        this.database = database;
        this.key = key;
    }

    public void run()
    {
        while (true)
        {
            int counter = atomicCounter.incrementAndGet();
            String value = database.retrieve(key);
            System.out.println(counter + ":" + key + " => " + value);
        }
    }
}
