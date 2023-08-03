import java.util.LinkedList;

public class LinkedLists {
	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<String>();

		linkedList.offer("A");	// => First || Head || 0
		linkedList.offer("B");	// 1
		linkedList.offer("C");	// 2
		linkedList.offer("D");	// 3
		linkedList.offer("F");	// => Last || Tail || 4

		System.out.println(linkedList);
		linkedList.add(4, "E");

		System.out.println(linkedList);
		System.out.println(linkedList.indexOf("F"));
		linkedList.remove("E");

		System.out.println(linkedList.indexOf("F"));
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());

		linkedList.addFirst("@");
		linkedList.addLast("#");
		System.out.println(linkedList);

		linkedList.removeFirst();
		linkedList.removeLast();
		System.out.println(linkedList);
	}
}
