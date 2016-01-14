package Question2;
import java.util.TreeMap;

/**
 * Created by aviad on 09/01/2016.
 */
public class Dictionary
{

private TreeMap sortedMap;

public Dictionary()
	{
		//sortedMap = new HashMap<String, String>();
		sortedMap = new TreeMap();

	}

protected void addTerm(DictionaryValue item) throws DictionaryExceptions
	{
		if (sortedMap.containsKey(item.term)) throw new DictionaryExceptions("You are trying to add an " +
				"item that is already exists on dictionary: " + item.term);
		else
			{
			sortedMap.put(item.term, item.translation);

			}
	}

protected void updateTerm(String item, String newTranslation) throws DictionaryExceptions
	{

		if (!sortedMap.containsKey(item)) throw new DictionaryExceptions("You are trying to update translation for " +
				"a term which doesn't on the dictionary: " + item);
		else
			{
			sortedMap.replace(item, newTranslation);

			}
	}

protected void deleteTerm(String item) throws DictionaryExceptions
	{

		if (!sortedMap.containsKey(item)) throw new DictionaryExceptions("You are trying to delete " +
				"a term doesn't isn't on the dictionary: " + item);
		else
			{
			sortedMap.remove(item);

			}
	}

protected DictionaryValue findTerm(DictionaryValue dv) throws DictionaryExceptions
	{
		if (!sortedMap.containsKey(dv.term)) throw new DictionaryExceptions("Term wasn't found: \n" + dv);
		else
			{

			return dv;
			}
	}

protected DictionaryValue[] getDictionaryValues()
	{
		DictionaryValue[] dv = new DictionaryValue[sortedMap.size()];
		for (int i = 0; i < sortedMap.size(); i++)
			{
			dv[i] = (DictionaryValue) sortedMap.get(i);
			}
		return dv;
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
