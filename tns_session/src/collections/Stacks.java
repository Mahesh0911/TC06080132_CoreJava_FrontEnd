package collections;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {

		Stack stack=new Stack();
		stack.push(10);
		stack.push(20);
		stack.push("A");
		stack.push("B");
		
		System.out.println(stack);
		
		System.out.println(stack.empty());
		System.out.println(stack.peek());
		System.out.println(stack.search("A"));
		System.out.println(stack.search(10));
		
		stack.pop();
		System.out.println(stack);
		
	}

}

