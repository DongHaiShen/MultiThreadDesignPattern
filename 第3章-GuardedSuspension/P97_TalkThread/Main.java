package P97_TalkThread;

public class Main
{
    public static void main(String[] args)
    {
        RequestQueue requestQueue1 = new RequestQueue();
        RequestQueue requestQueue2 = new RequestQueue();

        // 先加入一个种子
        requestQueue1.putRequest(new Request("Hello"));

        new TalkThread(requestQueue1, requestQueue2, "Alice").start();
        new TalkThread(requestQueue2, requestQueue1, "Bobby").start();
    }
}

