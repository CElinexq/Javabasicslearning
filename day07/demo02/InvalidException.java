package cn.itcast.day07.demo02;

public class InvalidException extends RuntimeException
{
    public InvalidException()
    {
        super();
    }

    public InvalidException(String message)
    {
        super(message);
    }
}
