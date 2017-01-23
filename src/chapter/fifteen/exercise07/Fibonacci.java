package chapter.fifteen.exercise07;

public class Fibonacci implements Generator<Integer>{
	private int count = 0;
	public Integer next(){
		return fib(count++);
	}
	
	private int fib(int n) {
		return n < 2 ? 1 : ( fib(n - 2) + fib(n - 1));
	}
}
