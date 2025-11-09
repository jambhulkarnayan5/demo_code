package singletoneClass;

public class Main {
	
	public static void main(String[] args) {
	
//App app = App.getInstance();
App app1 = App.getInstance();
App app2 = App.getInstance();

// System.out.println(app);
 System.out.println(app1);
 System.out.println(app2);
 
 App.doSomething();
 

	
		
	


}
}