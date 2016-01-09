package Question1;
/**
 * Created by aviad on 03/01/2016.
 */
public class Node<E>
{

protected E item;
protected Node next;
protected Node prev;

public Node(E item)
	{
		this(item, null);
	}

public Node(E item, Node next)
	{
		this.item = item;
		this.next = next;
	}

public Node(Node prev, E item, Node next)
	{
		this.prev = prev;
		this.item = item;
		this.next = next;

	}

protected Comparable getItem() {return (Comparable) item;}

protected void setItem(E item) {this.item = item;}

protected Node getNext() {return next;}

protected void setNext(Node next) {this.next = next;}

}
