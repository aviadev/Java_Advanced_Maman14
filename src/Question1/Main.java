package Question1;

public class Main
{

public static void main(String[] args)
	{
		/*LinkedList linkedList1 = new LinkedList();
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
		System.out.println(linkedList2.toString());*/

		Person p1 = new Person("Aviad", 200373470, 1987);
		Person p2 = new Person("Bar", 201166881, 1990);
		Person p3 = new Person("Moshe", 201166881, 1980);
		Person p4 = new Person("Shay Tavor", 777, 1950);

		System.out.println("\nComparing: \n" + p1.toString() + "to:\n" + p2.toString() + "\nResult is: " + p1.compareTo(p2));
		System.out.println("\nComparing: \n" + p2.toString() + "to:\n" + p1.toString() + "\nResult is: " + p2.compareTo(p1));
		System.out.println("\nComparing: \n" + p2.toString() + "to:\n" + p3.toString() + "\nResult is: " + p2.compareTo(p3));
		System.out.println("\nComparing: \n" + p2.toString() + "to:\n" + p2.toString() + "\nResult is: " + p2.compareTo(p2));

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

		System.out.println("\nList 1 add first is: \n\n" + linkedList3);
		System.out.println("\nList 2 add last is: \n\n" + linkedList4);


		General general = new General();
		System.out.println("Oldest person on list1: \n" + general.max(linkedList3));
		System.out.println("Oldest person on list2: \n" + general.max(linkedList4));


	}
}
