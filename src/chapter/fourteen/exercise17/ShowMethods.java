/**
'* Exercise 17 /18
 * Memo: 
 * friendly method "show()" is not printed out when executed in Tester.java,
 * that is in the same Package 
 * 
 */
package chapter.fourteen.exercise17;

import java.lang.reflect.*;
import java.util.regex.Pattern;

/**
 * @author ren
 *
 */
class ShowMethods {
	private static Pattern p1 = Pattern.compile("\\w+\\.|native |final ");		
	private static Pattern p2 = Pattern.compile("\\w\\.");		
	void testPrivte() {
		
	}
	public static void show(String args) {
		try {
			Class<?> c = Class.forName(args);
			Method[] mthds = c.getMethods();
			Constructor<?>[] cstrs = c.getConstructors();
			for (Method m : mthds) {
				System.out.println(p1.matcher(m.toString()).replaceAll(""));
			}
			for (Constructor<?> cstr : cstrs) {
				System.out.println(p1.matcher(cstr.toString()).replaceAll(""));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
