package singletoneClass;

public class App {
	
	private static App app;
	
	private App() {
		//Hinder other classes to create object of this class
	}
	
	public static  App getInstance()
	{
		if(null==app)
		{
			App	app=new App();
		}
	return app;
		
		 
	}
	 
	
   public static void doSomething() {
	 
	 System.out.println("DoSomething method called");
		
	}
   
  

}
