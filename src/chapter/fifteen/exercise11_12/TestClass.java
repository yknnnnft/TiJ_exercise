package chapter.fifteen.exercise11_12;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class TestClass<T> {
	private T t;
	public TestClass(T t) {
		this.t = t;
		System.out.println(t.getClass().getSimpleName());
	}
	public static void main(String[] args) {
	}
}
