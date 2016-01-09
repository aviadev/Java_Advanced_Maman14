package Question1;
import java.util.Scanner;

public class Main
{

public static void main(String[] args)
	{
		LinkedList linkedList1 = new LinkedList();
		LinkedList linkedList2 = new LinkedList();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 6; i++)
			{
			System.out.println("Please input a string");
			String userInput = scan.nextLine();
			linkedList1.addLast(userInput);
			linkedList2.addFirst(userInput);
			}

		System.out.println(linkedList1.toString());
		System.out.println(linkedList2.toString());

		Person p1 = new Person("Aviad", 200373470, 1987);
		Person p2 = new Person("Bar", 201166881, 1990);
		Person p3 = new Person("Moshe", 201166881, 1980);
		Person p4 = new Person("Shay Tavor", 777, 1950);

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p1.compareTo(p2));
		System.out.println(p2.compareTo(p1));
		System.out.println(p2.compareTo(p3));
		System.out.println(p2.compareTo(p2));

		LinkedList linkedList3 = new LinkedList();
		linkedList3.addFirst(p1);
		linkedList3.addFirst(p2);
		linkedList3.addFirst(p3);
		linkedList3.addFirst(p4);

		LinkedList linkedList4 = new LinkedList();
		linkedList4.addLast(p1);
		linkedList4.addLast(p2);
		linkedList4.addLast(p3);
		linkedList4.addLast(p4);

		General general = new General();
		System.out.println(general.max(linkedList3));
		Person max = (Person) general.max(linkedList4);
		Person max2 = (Person) general.max(linkedList3);
		System.out.println(max);
		System.out.println(max2);
		System.out.println(general.max(linkedList4));

	}
}
