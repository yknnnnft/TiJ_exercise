package chapter.fourteen.exercise25.to;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import chapter.fourteen.exercise25.from.ClassHasPrivate;

public class PrivateCaller {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Class<?> c = ClassHasPrivate.class;
		ClassHasPrivate cp = new ClassHasPrivate();
		Field[] allFields = c.getDeclaredFields();
		for (Field f : allFields) {
			f.setAccessible(true); // IllegalAccessException without this code
			System.out.println(f.get(cp));
		}
		Method[] allMethods = c.getDeclaredMethods();
		for (Method m : allMethods) {
			m.setAccessible(true);
			m.invoke(cp);
		}
		
	}

}
