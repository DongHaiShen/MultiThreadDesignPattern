package P56_DeadLock.Answer2;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Testing EaterThread, hit CTRL+C to exit.");
        Tool spoon = new Tool("Spoon");
        Tool fork = new Tool("Fork");

        // 必须拿取成对的勺子和叉子
        // 破坏了存在多个SharedResource角色这一条件
        Pair pair = new Pair(spoon, fork);
        new EaterThread("Alice", pair).start();
        new EaterThread("Bobby", pair).start();
    }
}

