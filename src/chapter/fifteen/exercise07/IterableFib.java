package chapter.fifteen.exercise07;

import java.util.Iterator;

public class IterableFib implements Iterable<Integer>{
	private int count;
	private Fibonacci f = new Fibonacci();
	public IterableFib(int count) {
		this.count = count;
	}
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>(){
			public boolean hasNext() {
				return count > 0;
			}

			public Integer next() {
				count--;
				return f.next();
			}
		};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i : new IterableFib(18)) {
			System.out.println(i);
		}
	}

}
