package P463_DoubleChecked;

import java.util.Date;

/**
 * 无法确保能够正确地运行
 */
public class DoubleCheck
{
    private static DoubleCheck instance = null;
    private Date date = new Date();

    private DoubleCheck()
    {
    }

    public Date getDate()
    {
        return date;
    }

    public static DoubleCheck getInstance()
    {
        if (instance == null)                       // (a) 第一次test
        {
            synchronized (DoubleCheck.class)        // (b) 进入synchronized代码块
            {
                if (instance == null)               // (c) 第二次test
                {
                    instance = new DoubleCheck();   // (d) set
                }
            }                                       // (e) 从synchronized代码块中退出
        }
        return instance;                            // (f)
    }
}
