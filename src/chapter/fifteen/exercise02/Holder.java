package chapter.fifteen.exercise02;

public class Holder<T>{
	public T firstEle;
	public T secondEle;
	public T thirdEle;

	public Holder(T a, T b, T c) {
		firstEle = a;
		secondEle = b;
		thirdEle = c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Holder<String> h = new Holder("a", "b", "c");
		System.out.println(h.firstEle);
	}

}
