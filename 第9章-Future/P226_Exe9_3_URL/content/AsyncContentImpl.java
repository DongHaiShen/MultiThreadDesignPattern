package P226_Exe9_3_URL.content;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class AsyncContentImpl extends FutureTask<SyncContentImpl> implements Content
{
    public AsyncContentImpl(Callable<SyncContentImpl> callable)
    {
        super(callable);
    }

    public byte[] getBytes()
    {
        byte[] bytes = null;
        try
        {
            bytes = get().getBytes();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        catch (ExecutionException e)
        {
            e.printStackTrace();
        }
        return bytes;
    }
}
