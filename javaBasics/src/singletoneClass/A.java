package singletoneClass;

public class A {
	
	private static A obj = new A(); // Early instance created at the load time
	private A() {

 }
	public static A getA() {
		
		return obj;
	}
	
	public void doSomething() {
		
	}
}
