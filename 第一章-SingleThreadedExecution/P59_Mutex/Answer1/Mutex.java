package P59_Mutex.Answer1;

public final class Mutex
{
    private boolean busy = false;

    // 当某个线程连续调用lock，由于busy为true，因此会wait
    // 这称为不可重入
    public synchronized void lock()
    {
        while (busy)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
            }
        }
        busy = true;
    }

    // 即使不调用lock，也可以调用unlock
    public synchronized void unlock()
    {
        busy = false;
        notifyAll();
    }
}
