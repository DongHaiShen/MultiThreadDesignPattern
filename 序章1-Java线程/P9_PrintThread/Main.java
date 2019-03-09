package P9_PrintThread;

public class Main
{
    public static void main(String[] args)
    {
        // 创建Thread子类的实例
        new PrintThread("Good!").start();
        new PrintThread("Nice!").start();
    }
}

