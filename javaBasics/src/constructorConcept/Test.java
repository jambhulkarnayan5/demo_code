
//How to call one constructor from the other constructor
package constructorConcept;

public class Test {
	
	private Test() {
		this(10);
		System.out.println("Zero argument constructor");
	}

	public Test(int i) {
		this(12,13);
		System.out.println("Single argument constructor");
	}
	
	public Test(int i, int j) {
		System.out.println("Double argument constructor");
		
	}

	public static void main(String[] args) {
		
		new Test();
		

	}
	

}
