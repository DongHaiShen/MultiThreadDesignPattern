package P5_TwoThreads;

public class Main
{
    public static void main(String[] args)
    {
        // 创建新线程实例
        MyThread t = new MyThread();

        // main主线程启动新线程
        // 之后新线程再去调用run方法
        t.start();

        // 输出结果显示，多线程情况下输出不一定按照代码顺序
        for (int i = 0; i < 10000; i++)
        {
            System.out.print("Good!");
        }
    }
}
