package singletoneClass;

public class B {
	
	private static B obj;
	
	private B() {
		
	}
	
	public static B getB() {
		if(obj==null) {
			synchronized(B.class) {
				if(obj==null) {
					obj=new B();
				}
			}
		}
		return obj;
	}
	
	public void doSomething() {
		
	}
	

}
