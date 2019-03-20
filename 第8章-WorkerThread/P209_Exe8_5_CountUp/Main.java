package P209_Exe8_5_CountUp;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getName() + ":BEGIN");
        new MyFrame();
        System.out.println(Thread.currentThread().getName() + ":END");
    }
}
