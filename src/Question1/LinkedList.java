package Question1;
/**
 * Created by aviad on 03/01/2016.
 */
public class LinkedList<E extends Comparable<E>>
{

protected Node<E> head;
protected Node<E> tail;
protected int size = 0;

protected LinkedList()
	{
		head = null;
	}

protected E getFirst()
	{
		final Node<E> first = head;
		if (first == null) throw new EmptyListException();
		return first.item;
	}

protected E getLast()
	{
		final Node<E> last = tail;
		if (last == null) throw new EmptyListException();
		return last.item;
	}

protected void addFirst(E item)
	{
		final Node<E> first = head;
		final Node<E> newNode = new Node<>(null, item, first);
		head = newNode;
		if (first == null) tail = newNode;
		else first.prev = newNode;
		size++;
	}

protected void addLast(E item)
	{
		final Node<E> last = tail;
		final Node<E> newNode = new Node<>(last, item, null);
		tail = newNode;
		if (last == null) head = newNode;
		else last.next = newNode;
		size++;
	}

protected E removeFirst()
	{
		final Node<E> first = head;
		if (first == null) throw new EmptyListException("List is empty");
		final E element = first.item;
		final Node<E> next = first.next;
		first.item = null;
		first.next = null; // help GC
		head = next;
		if (next == null) tail = null;
		size--;
		return element;
	}

@Override
public String toString()
	{
		return toString(head);
	}

private String toString(Node<E> node)
	{
		if (node == null) return "";
		else return node.getItem() + "\n" + toString(node.getNext());
	}

protected Node<E> getFirstElement() {return head;}

protected Node<E> getLastElement() {return tail;}

protected int size()
	{
		return size;
	}

}
