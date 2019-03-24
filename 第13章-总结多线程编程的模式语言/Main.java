/**
 * @Author sdh
 * @Date Created in 2019/3/24 18:12
 * @description
 */
public class Main
{
    public static void main(String[] args)
    {
        new Thread()
        {
            @Override
            public void run()
            {
                System.out.println("Hello Multithreading!");
            }
        }.start();
    }
}
