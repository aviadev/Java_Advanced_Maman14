package Question1;
import java.text.MessageFormat;

/**
 * Created by aviad on 08/01/2016.
 */
public class Person implements Comparable<Person>
{

protected String name;
protected long id;
protected int birthYear;

public Person()
	{

	}

public Person(String name, long id, int birthYear)
	{
		this.name = name;
		this.id = id;
		this.birthYear = birthYear;
	}

@Override
public String toString()
	{
		return MessageFormat.format("Person name = {0}\nPerson id = {1,number,#}\nPerson birth year = {2, number, #}\n",
				name, id, birthYear);
	}

@Override
public int compareTo(Person other)
	{
		if (this.birthYear < other.birthYear) return 1;
		if (this.birthYear > other.birthYear) return -1;
		else return 0;
	}
}
