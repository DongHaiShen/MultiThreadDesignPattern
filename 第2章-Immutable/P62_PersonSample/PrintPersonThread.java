package P62_PersonSample;

public class PrintPersonThread extends Thread
{
    private Person person;

    public PrintPersonThread(Person person)
    {
        this.person = person;
    }

    public void run()
    {
        while (true)
        {
            // Thread.currentThread用于获取当前线程
            System.out.println(Thread.currentThread().getName() + " prints " + person);
        }
    }
}
