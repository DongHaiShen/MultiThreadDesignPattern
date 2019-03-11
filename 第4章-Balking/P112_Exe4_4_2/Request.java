package P112_Exe4_4_2;

public class Request
{
    private final String name;

    public Request(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return "[ Request " + name + " ]";
    }
}
