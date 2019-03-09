package P10_Printer;

public class Main
{
    public static void main(String[] args)
    {
        // 将Runnable接口实现类的实例传给Thread的构造函数
        new Thread(new Printer("Good!")).start();
        new Thread(new Printer("Nice!")).start();
    }
}
