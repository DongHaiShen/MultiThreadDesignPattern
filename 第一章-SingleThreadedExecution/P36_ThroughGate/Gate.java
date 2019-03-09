package P36_ThroughGate;

public class Gate
{
    // 已经通过门的人数
    private int counter = 0;

    // 最后一个通过者的名字
    private String name = "Nobody";

    // 最后一个通过者的出生地
    private String address = "Nowhere";

    public void pass(String name, String address)
    {
        this.counter++;
        this.name = name;
        this.address = address;
        check();
    }

    public String toString()
    {
        return "No." + counter + ": " + name + ", " + address;
    }

    private void check()
    {
        if (name.charAt(0) != address.charAt(0))
        {
            System.out.println("***** BROKEN ***** " + toString());
        }
    }
}
