package chapter.fourteen.exercise25.to;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import chapter.fourteen.exercise25.from.ClassHasPrivate;

public class PrivateCaller {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Class<?> c = ClassHasPrivate.class;

		Method[] allMethods = c.getDeclaredMethods();
		for (Method m : allMethods) {
			m.setAccessible(true);
			m.invoke(new ClassHasPrivate());
		}
		
	}

}
