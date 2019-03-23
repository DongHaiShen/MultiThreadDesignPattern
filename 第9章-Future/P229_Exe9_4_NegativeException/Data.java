package P229_Exe9_4_NegativeException;

import java.util.concurrent.ExecutionException;

public interface Data
{
    public abstract String getContent() throws ExecutionException;
}
