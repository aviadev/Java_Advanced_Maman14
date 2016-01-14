package Question2;
/**
 * Created by aviad on 09/01/2016.
 */
public class DictionaryValue implements Comparable<DictionaryValue>
{

protected String term, translation;

public DictionaryValue() {}

public DictionaryValue(String term, String translation)
	{
		this.term = term.toLowerCase();
		this.translation = translation;
	}

@Override
public int compareTo(DictionaryValue other)
	{
		return this.term.compareTo(other.term);
	}

public boolean equals(Object other)
	{
		return other instanceof DictionaryValue && term.equals(((DictionaryValue) other).term);
	}

@Override
public String toString()
	{
		return "Term: " + term + ", Translation = " + translation;
	}

}
