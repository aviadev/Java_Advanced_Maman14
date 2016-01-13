package Question2;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by aviad on 09/01/2016.
 */
public class Dictionary
{

private HashMap data;
private TreeMap sortedMap;

public Dictionary()
	{
		data = new HashMap<String, String>();
		sortedMap = new TreeMap();

	}

protected void addTerm(DictionaryValue item) throws DictionaryExceptions
	{
		if (data.containsKey(item.term)) throw new DictionaryExceptions("You are trying to add an " +
				"item that is already exists on dictionary: " + item.term);
		else
			{
			data.put(item.term, item.translation);
			sortedMap = sortByKey(data);
			}
	}

protected void updateTerm(String item, String newTranslation) throws DictionaryExceptions
	{

		if (!data.containsKey(item)) throw new DictionaryExceptions("You are trying to update translation for " +
				"a term which doesn't on the dictionary: " + item);
		else
			{
			data.replace(item, newTranslation);
			sortedMap = sortByKey(data);
			}
	}

protected void deleteTerm(String item) throws DictionaryExceptions
	{

		if (!data.containsKey(item)) throw new DictionaryExceptions("You are trying to delete " +
				"a term doesn't isn't on the dictionary: " + item);
		else
			{
			data.remove(item);
			sortedMap = sortByKey(data);
			}
	}

protected DictionaryValue findTerm(DictionaryValue dv) throws DictionaryExceptions
	{
		if (!data.containsKey(dv.term)) throw new DictionaryExceptions("Term wasn't found: \n" + dv);
		else
			{

			return dv;
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

protected TreeMap sortByKey(HashMap data)
	{
		sortedMap.putAll(data);
		return sortedMap;

	}

@Override
public String toString()
	{
		String res = "";
		if (sortedMap.size() == 0) return res;
		else
			{
			for (int i = 0; i < sortedMap.size(); i++)
				{
				DictionaryValue dv = new DictionaryValue();
				dv.term = String.valueOf(sortedMap.keySet().toArray()[i]);
				dv.translation = String.valueOf(sortedMap.values().toArray()[i]);
				res += dv.toString() + "\n";
				}

			}
		return res;
	}
}
