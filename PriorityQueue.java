import java.util.Collections;
import java.util.Queue;

public class PriorityQueue {
	public static void main(String[] args) {
		// Priority Queue => A FIFO data structure that serves elements
		// with the highest priorities first before elements with lower priority
		Queue<Double> Grades = new java.util.PriorityQueue<>();

		Grades.offer(3.00);
		Grades.offer(1.25);
		Grades.offer(2.50);
		Grades.offer(1.00);

		while(!Grades.isEmpty()) {
			System.out.println(Grades.poll());
		}
		// Will arrange from highest grade to lowest

		// If you want the reverse order, do this:
		// Queue<Double> Grades = new PriorityQueue<>(Collections.reverseOrder());
		Queue<String> Letters = new java.util.PriorityQueue<>(Collections.reverseOrder());

		Letters.offer("A");
		Letters.offer("B");
		Letters.offer("C");
		Letters.offer("D");
		Letters.offer("E");

		while(!Letters.isEmpty()) {
			System.out.println(Letters.poll());
		}
	}
}
