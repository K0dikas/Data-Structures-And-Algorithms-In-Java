import java.util.Stack;

public class LastInFirstOut {
	public static void main(String[] args) {
		// Last In, First Out => LIFO

		Stack<String> Names = new Stack<String>();
		// empty() => Used to check whether a stack is empty or not, returns true or false: boolean
		System.out.println(Names.empty());

		// push() => Is used to push an element into the Stack
		Names.push("Belle");	// Bottom
		Names.push("Angel");
		Names.push("Jerry");
		Names.push("Tom");
		Names.push("CJ");	// Top

		System.out.println(Names);
		System.out.println(Names.empty());
		System.out.println(Names.peek());
		System.out.println(Names.search("CJ"));

		// pop() => Is used to pop an element from the stack, starting from the top
		// Using a for loop, we are popping the elements from the stack,  except for the bottom
		for(int i = 1; i <= 4; ++i) {
			Names.pop();
		}

		System.out.println(Names);
		System.out.println(Names.empty());
	}
}
