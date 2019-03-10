package P56_DeadLock.Answer1;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Testing EaterThread, hit CTRL+C to exit.");
        Tool spoon = new Tool("Spoon");
        Tool fork = new Tool("Fork");

        // 让Alice和Bobby都是按 “勺子——>叉子”的顺序获取
        // 破坏了获取SharedResource角色的锁的顺序并不固定这一条件
        new EaterThread("Alice", spoon, fork).start();
        new EaterThread("Bobby", spoon, fork).start();
    }
}

