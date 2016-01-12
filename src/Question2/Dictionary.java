package Question2;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by aviad on 09/01/2016.
 */
public class Dictionary
{

private HashMap data;

public Dictionary()
	{
		data = new HashMap<String, String>();
	}

protected void addTerm(DictionaryValue item) throws DictionaryExceptions
	{
		if (data.containsKey(item.term)) throw new DictionaryExceptions("You are trying to add an " +
				"item that is already exists on dictionary: " + item.term);
		else
			{
			data.put(item.term, item.translation);
			sortByKey(data);
			}
	}

protected void updateTerm(String item, String newTranslation) throws DictionaryExceptions
	{

		if (!data.containsKey(item)) throw new DictionaryExceptions("You are trying to update translation for " +
				"a term which doesn't on the dictionary: " + item);
		else
			{
			data.replace(item, newTranslation);
			sortByKey(data);
			}
	}

protected void deleteTerm(String item) throws DictionaryExceptions
	{

		if (!data.containsKey(item)) throw new DictionaryExceptions("You are trying to delete " +
				"a term doesn't isn't on the dictionary: " + item);
		else
			{
			data.remove(item);
			sortByKey(data);
			}
	}

protected DictionaryValue[] getDictionaryValues()
	{
		DictionaryValue[] dv = new DictionaryValue[data.size()];
		for (int i = 0; i < data.size(); i++)
			{
			dv[i] = (DictionaryValue) data.get(i);
			}
		return dv;
	}

protected java.util.Dictionary findTerm(String item) throws DictionaryExceptions
	{
		if (!data.containsKey(item)) throw new DictionaryExceptions("Term wasn't found: " + item);
		else return (java.util.Dictionary) data.get(item);

	}

protected void sortByKey(HashMap data)
	{
		Map<String, String> map = new TreeMap<String, String>(data);
	}

@Override
public String toString()
	{
		String res = "";
		if (data.size() == 0) return res;
		else
			{
			for (int i = 0; i < data.size(); i++)
				{
				DictionaryValue dv = new DictionaryValue();
				dv.term = String.valueOf(data.keySet().toArray()[i]);
				dv.translation = String.valueOf(data.values().toArray()[i]);
				res += dv.toString() + "\n";
				}

			}
		return res;
	}
}
