package P56_SecurityGateTest;

public class CrackerThread extends Thread
{
    private final SecurityGate gate;

    public CrackerThread(SecurityGate gate)
    {
        this.gate = gate;
    }

    /**
     * 每次模拟10次进出
     */
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            gate.enter();
            gate.exit();
        }
    }
}

