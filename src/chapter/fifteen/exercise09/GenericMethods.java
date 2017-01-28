package chapter.fifteen.exercise09;

public class GenericMethods {
	public static <R, S, T> void f(R r, S s, T t) {
		String mr = r.getClass().getName();
		String ms = s.getClass().getName();
		String mt = t.getClass().getName();
		System.out.println("f with 3 generic");
		System.out.println(mr + " " + ms + " " + mt);
	}
	public static <S, T> void f(S s, T t, Integer i) {
		String ms = s.getClass().getName();
		String mt = t.getClass().getName();
		String mi = i.getClass().getName();
		System.out.println("f with 2 generic");
		System.out.println(ms + " " + mt + " " + mi) ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethods.f("1", 1, 1.0);
		GenericMethods.f("1", 1, 1);
	}

}
/**
 * output: 
 * f with 3 generic
 * java.lang.String java.lang.Integer java.lang.Double
 * f with 2 generic
 * java.lang.String java.lang.Integer java.lang.Integer
 */
