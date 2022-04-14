package mao.jquery_ajax_request.data;

/**
 * Project name(项目名称)：jQuery_ajax_request
 * Package(包名): mao.jquery_ajax_request.data
 * Class(类名): Data
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/14
 * Time(创建时间)： 16:50
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public class Data
{
    private int a = 123;
    private int b = 56;
    private int c = 54;
    private String message = "hello";

    /**
     * Instantiates a new Data.
     */
    public Data()
    {

    }

    /**
     * Instantiates a new Data.
     *
     * @param a       the a
     * @param b       the b
     * @param c       the c
     * @param message the message
     */
    public Data(int a, int b, int c, String message)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.message = message;
    }

    /**
     * Gets a.
     *
     * @return the a
     */
    public int getA()
    {
        return a;
    }

    /**
     * Sets a.
     *
     * @param a the a
     */
    public void setA(int a)
    {
        this.a = a;
    }

    /**
     * Gets b.
     *
     * @return the b
     */
    public int getB()
    {
        return b;
    }

    /**
     * Sets b.
     *
     * @param b the b
     */
    public void setB(int b)
    {
        this.b = b;
    }

    /**
     * Gets c.
     *
     * @return the c
     */
    public int getC()
    {
        return c;
    }

    /**
     * Sets c.
     *
     * @param c the c
     */
    public void setC(int c)
    {
        this.c = c;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message)
    {
        this.message = message;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("a：").append(a).append('\n');
        stringbuilder.append("b：").append(b).append('\n');
        stringbuilder.append("c：").append(c).append('\n');
        stringbuilder.append("message：").append(message).append('\n');
        return stringbuilder.toString();
    }
}
