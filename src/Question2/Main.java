package Question2;
public class Main
{

public static void main(String[] args)
	{

		Dictionary dictionary = new Dictionary();

		//try
		//	{
	/*		dictionary.addTerm(new DictionaryValue("House", "Casa"));
			dictionary.addTerm(new DictionaryValue("ham", "jamon"));
			dictionary.addTerm(new DictionaryValue("cheese", "queso"));
			dictionary.addTerm(new DictionaryValue("chicken", "pollo"));
			dictionary.addTerm(new DictionaryValue("eggs", "huevos"));
			dictionary.addTerm(new DictionaryValue("breakfast", "desayuno"));*/

		// Try to add Term that already exists.
		//dictionary.addTerm(new DictionaryValue("ham", "jamon"));
		//dictionary.addTerm(new DictionaryValue("ham", "dfsdfsd"));

		// Try to remove Term that doesn't exists.
		//dictionary.deleteTerm("DeleteTermFailed");

		// Find Term that doesn't exists.
		//dictionary.findTerm("FindTermFailed");

		// Update Term that doesn't exists.
		//dictionary.updateTerm("UpdateNotFound", "blabla");

		/*	dictionary.updateTerm("eggs", "beizim");
			dictionary.findTerm("eggs");
			dictionary.deleteTerm("ham");*/

		//	}
		//catch (DictionaryExceptions dictionaryExceptions)
		//{
		//	dictionaryExceptions.printStackTrace();
		//	}

		//Expect exception for trying to update value that doesn't exists
		//dictionary.updateTerm(word4, "beizim");
		// Now add the eggs word to dictionary and update it's value
		//dictionary.addTerm(new DictionaryValue("House", "Casa"));

		//dictionary.deleteTerm(word4);

		//System.out.println(dictionary.toString());

		//JFrame frame = new JFrame("My Dictionary");
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DictionaryPanel p = new DictionaryPanel();
		//frame.add(p);
		//frame.setSize(500, 500);
		//frame.setVisible(true);

	}
}
