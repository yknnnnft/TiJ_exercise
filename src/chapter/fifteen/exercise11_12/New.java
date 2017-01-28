// Utilities to simplify generic container creation
// by using type argument inference.
package chapter.fifteen.exercise11_12;
import java.util.*;

public class New {
  public static <K,V> Map<K,V> map() {
    return new HashMap<K,V>();
  }
  public static <T> List<T> list() {
    return new ArrayList<T>();
  }
  public static <T> LinkedList<T> lList() {
    return new LinkedList<T>();
  }
  public static <T> Set<T> set() {
    return new HashSet<T>();
  }	
  public static <T> Queue<T> queue() {
    return new LinkedList<T>();
  }
  public static <T> TestClass<T> testClass(T t) {
	  return new TestClass<T>(t);
  }
  // Example:
  public static void main(String[] args) {
//    Map<String, List<String>> sls = New.map();
//    List<String> ls = New.list();
//    LinkedList<String> lls = New.lList();
//    Set<String> ss = New.set();
//    Queue<String> qs = New.queue();
	 TestClass<Integer> t1 = New.testClass(1);
	 TestClass<Integer> t2 = New.<Integer>testClass(1);
  }
} ///:~
/**
 + memo : there seems no way to make an instance of a generic which is not extended from a base class
 */