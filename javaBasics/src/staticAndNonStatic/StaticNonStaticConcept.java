package staticAndNonStatic;

public class StaticNonStaticConcept {
	
	int a=10;
    static int b=20;
   
    
    static void show() {
    	
    	System.out.println("show(): "+b);
    	//System.out.println("disp(): "+a+" "+b);   // compilation issue occure because we can not access non static variable in static method
    	 StaticNonStaticConcept t = new StaticNonStaticConcept();
    	t.disp();
    	
    	System.out.println("show() with non static var: "+t.a); // 
    }
    
    void disp()
    {
    	System.out.println("disp(): "+a+" "+b);  
    	
    	
    }
	public static void main(String[] args) {
		
		
		StaticNonStaticConcept t= new StaticNonStaticConcept();
		StaticNonStaticConcept.show();
	     t.disp();

	}

}

// 1. Static methods belongs to the class, not to the object.
// 2. A static method can be accessed directly by class name & does not need any object.
// 3.Static methods can access only static data.It can not access non static data i.e. instance data.
// 4. A Static methods can call only other static methods & cannot call a non- static method.
// 5. A Static method cannot refer to "this" or "Super" keyword in anyway.