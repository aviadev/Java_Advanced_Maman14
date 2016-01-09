package Question1;
/**
 * Created by aviad on 09/01/2016.
 */
public class General<E extends Comparable<E>>
{

public General() {}

protected E max(LinkedList linkedList)
	{

		if (linkedList.head.getNext() == null) throw new EmptyListException("List is empty");
		Node<E> temp = linkedList.head.getNext();
		Comparable max = linkedList.head.getItem();
		while (temp != null)
			{
			E candidateValue = (E) temp.getItem();
			if (candidateValue.compareTo((E) max) > 0)
				{
				max = candidateValue;
				}
			temp = temp.getNext();
			}
		return (E) max;
	}

}
