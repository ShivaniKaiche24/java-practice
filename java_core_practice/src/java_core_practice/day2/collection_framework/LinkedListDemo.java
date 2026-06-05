package java_core_practice.day2.collection_framework;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<>();
		
		// 1. Add to end 
		list.add("Google");
		list.add("MasterCard");
		list.add("Delloit");
		
		System.out.println(list);
		
		// 2. Add from front - 0(1) - ArrayList cannot do this efficiently
		list.addFirst("TCS");
		
		System.out.println(list);
		
		// 3. Add from last
		list.addLast("Infosys");
		
		System.out.println(list);
		
		// 4 . Remove from front - useful as Queue
		String first =list.removeFirst();
		
		System.out.println(first); // o/p :- TCS
		System.out.println(list);
		
		// 5. Peek - see without removing
		System.out.println("Next to apply :- " + list.peekFirst());
		
		// 6. Use as a Stack
		LinkedList<String> stack = new LinkedList<>();
		
		stack.push("Step1");
		stack.push("Step2");
		stack.push("Step3");
		System.out.println(stack);
		System.out.println(stack.pop()); // step 3 (last in , First out ) LIFO.

	}

}
