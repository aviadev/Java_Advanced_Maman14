package Question1;
/**
 * Created by aviad on 08/01/2016.
 */
public class EmptyListException extends RuntimeException
{

public EmptyListException()
	{
		super();
	}

public EmptyListException(String msg)
	{
		super(msg);
	}
}
