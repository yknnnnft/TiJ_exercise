package chapter.fourteen.exercise25.from;

public class ClassHasPrivate {
	private String privateString = "I'm private!";
	protected String protectedString = "I'm protected!";
	String friendlyString = "I'm friendly!";
	
	private void privateMethod() {
		System.out.println("this is a private method");

	}
	
	protected void protectedMethod() {
		System.out.println("this is a protected method");
	}
	
	void friendMethod() {
		System.out.println("this is a friendly method");
	}
}
