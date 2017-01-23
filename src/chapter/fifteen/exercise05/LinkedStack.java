package chapter.fifteen.exercise05;

public class LinkedStack<T> {
	private class Node {
		T item;
		Node next;
		Node() {
			item = null;
			next = null;
		}
		Node(T item, Node next) {
			this.item = item;
			this.next = next;
		}
		boolean end() {
			return item == null && next == null;
		}
	}
	private Node top = new Node();
	
	public void push(T item) {
		top = new Node(item, top);
	}
	
	public T pop() {
		T result = top.item;
		if (!top.end()) {
			top = top.next;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedStack<String> lss = new LinkedStack<String>();
		for (String s : "Phasers on stun!".split(" ")) {
			lss.push(s);
		}
		String s;
		while ((s = lss.pop()) != null) {
			System.out.println(s);
		}
	}

}
