/**
 * memo1: Object[] args <=> { }
 * memo2: Generics argument : use Object
 * memo3: method.invoke()
 */
package chapter.fourteen.proxy;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class InvokeTester {
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
		System.out.println("***[proxy]*** on " + new Date());
		return method.invoke(proxy, args);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			InvokeTester it = new InvokeTester();
			Map<String, String> m = new HashMap<String, String>();
			Class<?>[] o = { Object.class, Object.class };
			Object[] a = { "AA", "aa" };
			it.invoke(m, HashMap.class.getMethod("put",  o ), a);
			System.out.println(m);
		}
		catch(Exception e) {
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
