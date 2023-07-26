import java.util.LinkedList;
import java.util.Queue;

public class queue {
	public static void main(String[] args) {

		// Queue = FIFO Data Structure: First-In First-Out (ex. A line of people) First come, First serve
		// A collection designed for holding elements prior to processing
		// Linear data structure

		// Add => enqueue, offer()
		// remove => dequeue, poll()

		Queue<String> Names = new LinkedList<String>();
		// offer() => Inserts element into this queue

		// isEmpty() => Checks if the queue is empty, returns a boolean type: true or false 
		System.out.println(Names.isEmpty());
		Names.offer("Angel");
		Names.offer("Belle");
		Names.offer("Lucas");
		Names.offer("Robert");
		Names.offer("Raquel");
		// size() => Checks the number of elements in the queue
		System.out.println(Names.size());

		// peek() => Examine the head of the queue
		System.out.println(Names.peek());
		System.out.println(Names);

		// contains() => Checks if a certain element is present in the queue
		System.out.println(Names.contains("Meep"));

		Names.poll();	// The name "Angel" will be dequeue
		System.out.println(Names);
		System.out.println(Names.isEmpty());
	}
}
